package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.ProfSaude;

public class ProfSaudeControle {

    public void cadastrar(String nome, String endereco, long numIdentidade)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaude ps = new ProfSaude(nome, endereco, numIdentidade);
        ps.cadastrar();
    }

    public ArrayList<ProfSaude> listarProfSaude() throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaude ps = new ProfSaude();
        return ps.listarProfissionais();
    }

    public void removerProfSaude(long numNacionalIdentidade)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaude ps = new ProfSaude();
        ps.removerProfissional(numNacionalIdentidade);
    }

    public ProfSaude pesquisarProfissional(long numNacionalIdentidade)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaude ps = null;
        ArrayList<ProfSaude> proficionais = listarProfSaude();
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
        ProfSaude ps = pesquisarProfissional(numNacionalIdentidade);
        return ps.imprimir();
    }

    public String ImprimirTodos() throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<ProfSaude> profissionais = listarProfSaude();
        String p = "";
        for (int i = 0; i < profissionais.size(); i++) {
            p += profissionais.get(i).imprimir() + "\n\n\n";
        }
        return p;
    }

}
