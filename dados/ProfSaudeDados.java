package dados;

import modelo.ProfSaude;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProfSaudeDados {

    public void cadastrarProf(ProfSaude profS) throws IOException, ClassNotFoundException {
        ArrayList<ProfSaude> profissional = new ArrayList<>();
        File arq = new File("listarProfdeSaude.dat");
        if (arq.exists())
            profissional = listarProfissionais();

        profissional.add(profS);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(profissional);
        }
    }

    public ArrayList<ProfSaude> listarProfissionais()
            throws IOException, ClassNotFoundException, FileNotFoundException {
        ArrayList<ProfSaude> profissional;
        File arq = new File("listarProfdeSaude.dat");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream readOb = new ObjectInputStream(fluxo);
        profissional = (ArrayList<ProfSaude>) readOb.readObject();
        readOb.close();
        return profissional;
    }

    public void removerProfissional(long numNacionalIdentidade)
            throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
        ArrayList<ProfSaude> profissional = new ArrayList<>();
        File arq = new File("listarProfdeSaude.dat");
        if (arq.exists())
            profissional = listarProfissionais();

        for (int i = 0; i < profissional.size(); i++) {
            if (numNacionalIdentidade == profissional.get(i).getNumNacionalIdentidade()) {
                profissional.remove(i);
                break;
            }
        }
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(profissional);
        }
    }
}
