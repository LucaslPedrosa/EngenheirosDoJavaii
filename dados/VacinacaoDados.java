package dados;

import modelo.ProfSaude;
import modelo.Vacina;
import modelo.Vacinacao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class VacinacaoDados {

    public void cadastrarProf(Vacinacao vacinacao) throws IOException, ClassNotFoundException {
        ArrayList<Vacinacao> vacinacoes = new ArrayList<>();
        File arq = new File("listarVacinacoes.ser");
        if (arq.exists())
            vacinacoes = listarVacinacoes();

        vacinacoes.add(vacinacao);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(vacinacoes);
        }
    }

    public ArrayList<Vacinacao> listarVacinacoes() throws IOException, ClassNotFoundException, FileNotFoundException {
        ArrayList<Vacinacao> vacinacoes;
        File arq = new File("listarVacinacoes.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream readOb = new ObjectInputStream(fluxo);
        vacinacoes = (ArrayList<Vacinacao>) readOb.readObject();
        readOb.close();
        return vacinacoes;
    }

    public void removerVacinacao(Vacina vacina, String data, ProfSaude proSRes, int dose)
            throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
        ArrayList<Vacinacao> vacinacoes = new ArrayList<>();
        File arq = new File("listarProfdeSaude.ser");
        if (arq.exists())
            vacinacoes = listarVacinacoes();

        for (int i = 0; i < vacinacoes.size(); i++) {
            if (vacina.equals(vacinacoes.get(i).getVacina()) && proSRes.equals(vacinacoes.get(i).getProficionalSaude())
                    && data.equals(vacinacoes.get(i).getData()) && dose == vacinacoes.get(i).getDose()) {
                vacinacoes.remove(i);
                break;
            }
        }
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(vacinacoes);
        }
    }
}
