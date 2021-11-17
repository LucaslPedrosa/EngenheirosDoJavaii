package dados;

import modelo.Vacina;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class VacinaDados {
    public void cadastrar(Vacina vac) throws IOException, ClassNotFoundException {
        ArrayList<Vacina> vacinas = new ArrayList<>();
        File arq = new File("listaVacina.dat");
        if (arq.exists())
            vacinas = listarVacina();

        vacinas.add(vac);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(vacinas);
        }
    }

    public ArrayList<Vacina> listarVacina() throws IOException, ClassNotFoundException, FileNotFoundException {
        ArrayList<Vacina> vacinas;
        File arq = new File("listaVacina.dat");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream readOb = new ObjectInputStream(fluxo);
        vacinas = (ArrayList<Vacina>) readOb.readObject();
        readOb.close();
        return vacinas;
    }

    public void removerVacina(String marca, long lote)
            throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
        ArrayList<Vacina> vacinas = new ArrayList<>();
        File arq = new File("listaVacina.dat");
        if (arq.exists())
            vacinas = listarVacina();

        for (int i = 0; i < vacinas.size(); i++) {
            if (marca == vacinas.get(i).getMarca() && lote == vacinas.get(i).getLote()) {
                vacinas.remove(i);
                break;
            }
        }
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(vacinas);
        }
    }
}
