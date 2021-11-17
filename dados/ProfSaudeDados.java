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
        ArrayList<ProfSaude> proficional = new ArrayList<>();
        File arq = new File("listarProfdeSaude.dat");
        if (arq.exists())
            proficional = listarProficionais();

        proficional.add(profS);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(proficional);
        }
    }

    public ArrayList<ProfSaude> listarProficionais() throws IOException, ClassNotFoundException, FileNotFoundException {
        ArrayList<ProfSaude> proficional;
        File arq = new File("listarProfdeSaude.dat");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream readOb = new ObjectInputStream(fluxo);
        proficional = (ArrayList<ProfSaude>) readOb.readObject();
        readOb.close();
        return proficional;
    }

    public void removerProficional(long numNacionalIdentidade)
            throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
        ArrayList<ProfSaude> proficional = new ArrayList<>();
        File arq = new File("listarProfdeSaude.dat");
        if (arq.exists())
            proficional = listarProficionais();

        for (int i = 0; i < proficional.size(); i++) {
            if (numNacionalIdentidade == proficional.get(i).getNumNacionalIdentidade()) {
                proficional.remove(i);
                break;
            }
        }
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(proficional);
        }
    }
}
