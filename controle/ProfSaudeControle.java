package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.ProfSaude;

public class ProfSaudeControle {

    public void cadastrarVacina(String nome, String endereco, long numIdentidade)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaude ps = new ProfSaude(nome, endereco, numIdentidade);
        ps.cadastrar();
    }

    public ArrayList<ProfSaude> listarVacina() throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaude ps = new ProfSaude();
        return ps.listarProficionais();
    }

    public void removerVacina(long numNacionalIdentidade)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaude ps = new ProfSaude();
        ps.removerProficional(numNacionalIdentidade);
    }

    public ProfSaude pesquisarProficional(long numNacionalIdentidade)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaude ps = null;
        ArrayList<ProfSaude> proficionais = listarVacina();
        for (int i = 0; i < proficionais.size(); i++) {
            if (numNacionalIdentidade == proficionais.get(i).getNumNacionalIdentidade()) {
                ps = proficionais.get(i);
                break;
            }
        }
        return ps;
    }

    public String imprimir(long numNacionalIdentidade)
            throws ClassNotFoundException, FileNotFoundException, IOException {
        ProfSaude ps = pesquisarProficional(numNacionalIdentidade);
        return ps.imprimir();
    }

    public String ImprimirTodos() throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<ProfSaude> vacinas = listarVacina();
        String p = "";
        for (int i = 0; i < vacinas.size(); i++) {
            p += vacinas.get(i).imprimir() + "\n\n\n";
        }
        return p;
    }

}
