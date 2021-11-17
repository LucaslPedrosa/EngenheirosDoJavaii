package dados;

import modelo.Vacina;
import modelo.Vacinante;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class VacinanteDados {

    public void cadastrarVacinante(Vacinante vac) throws IOException, ClassNotFoundException {
        ArrayList<Vacinante> vacin = new ArrayList<>();
        File arq = new File("listaVacinantes.dat");
        if (arq.exists())
            vacin = listarVacinante();

        vacin.add(vac);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(vacin);
        }
    }

    public ArrayList<Vacinante> listarVacinante() throws IOException, ClassNotFoundException, FileNotFoundException {
        ArrayList<Vacinante> vacinante;
        File arq = new File("listaVacinantes.dat");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream readOb = new ObjectInputStream(fluxo);
        vacinante = (ArrayList<Vacinante>) readOb.readObject();
        readOb.close();
        return vacinante;
    }

    public void remover(long cpf)
            throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
        ArrayList<Vacinante> vacinante = new ArrayList<>();
        File arq = new File("listaVacinantes.dat");
        if (arq.exists())
            vacinante = listarVacinante();

        for (int i = 0; i < vacinante.size(); i++) {
            if (cpf == vacinante.get(i).getCPF()) {
                vacinante.remove(i);
                break;
            }
        }
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(vacinante);
        }
    }

}
