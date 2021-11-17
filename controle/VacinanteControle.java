package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Vacinante;

public class VacinanteControle {
    public void cadastrarVacinante(String nome, String sexo, String nascimento, String problemasDeSaude, long cpf)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinante vt = new Vacinante(nome, sexo, nascimento, problemasDeSaude, cpf);
        vt.cadastrar();
    }

    private ArrayList<Vacinante> listarVacinante() throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinante vt = new Vacinante();
        return vt.listarVaciante();
    }

    public void removerVacinante(long cpf) throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinante vt = new Vacinante();
        vt.remover(cpf);
    }

    public Vacinante pesquisarVacinante(long cpf) throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinante vt = null;
        ArrayList<Vacinante> vacinantes = listarVacinante();
        for (int i = 0; i < vacinantes.size(); i++) {
            if (cpf == vacinantes.get(i).getCPF()) {
                vt = vacinantes.get(i);
                break;
            }
        }
        return vt;
    }

    public String imprimirCadastro(long cpf) throws ClassNotFoundException, FileNotFoundException, IOException {
        Vacinante vt = pesquisarVacinante(cpf);
        return vt.imprimirCadastro();
    }

    public String imprimirCartaoVacina(long cpf) throws ClassNotFoundException, FileNotFoundException, IOException {
        Vacinante vt = pesquisarVacinante(cpf);
        return vt.imprimirCartaoVacina();
    }

    public String ImprimirTodosCadastros() throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<Vacinante> vacinantes = listarVacinante();
        String p = "";
        for (int i = 0; i < vacinantes.size(); i++) {
            p += vacinantes.get(i).imprimirCadastro() + "\n\n";
        }

        return p;
    }

    public void salvarAlteracoesCadastro(Vacinante a, Vacinante b)
            throws ClassNotFoundException, FileNotFoundException, IOException {
        a.remover(a.getCPF());
        b.cadastrar();
    }
}
