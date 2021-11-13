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

    public void cadastrar(Vacinante vac) throws IOException, ClassNotFoundException {
        ArrayList<Vacinante> vacin = new ArrayList<>();
        File arq = new File("listaVacinantes");
        if (arq.exists())
            vacin = listarVacin();

        vacin.add(vac);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(vacin);
        }
    }

    public void cadastrarVacinacao(Vacina vacine) {

    }

    public ArrayList<Vacinante> listarVacin() throws IOException, ClassNotFoundException, FileNotFoundException {
        ArrayList<Vacinante> vacin;
        File arq = new File("listaVacinantes");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream readOb = new ObjectInputStream(fluxo);
        vacin = (ArrayList<Vacinante>) readOb.readObject();
        readOb.close();
        return vacin;
    }

    public void remover(long cpf)
            throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
        ArrayList<Vacinante> vacin = new ArrayList<>();
        File arq = new File("listaVacinantes");
        if (arq.exists())
            vacin = listarVacin();

        for (int i = 0; i < vacin.size(); i++) {
            if (cpf == vacin.get(i).getCpf()) {
                vacin.remove(i);
                break;
            }
        }
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(vacin);
        }
    }
}
