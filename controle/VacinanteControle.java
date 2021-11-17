package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.ProfSaude;
import modelo.Vacina;
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

    public void addCartaoVacina(Vacina vacina, String data, ProfSaude proSRes, int dose) {
        Vacinante levaPicada = new Vacinante();
        levaPicada.addCartaoVacina(vacina, data, proSRes, dose);
    }

    public void removeCartaoVacina(Vacina vacina, String data, int dose) {
        Vacinante levaPicada = new Vacinante();
        levaPicada.removeCartaoVacina(vacina, data, dose);
    }

    public String imprimirCartaoVacina() {
        Vacinante levaPicada = new Vacinante();
        return levaPicada.imprimirCartaoVacina();
    }

    public void agendar(Vacina vacine, String data) {
        Vacinante levaPicada = new Vacinante();
        levaPicada.agendar(vacine, data);
    }

    public void removeAgenda(Vacina vacina, String data) {
        Vacinante levaPicada = new Vacinante();
        levaPicada.removeAgenda(vacina, data);
    }

    public String imprimirAgenda() {
        Vacinante levaPicada = new Vacinante();
        return levaPicada.imprimirAgenda();
    }

    public void salvarAlteracoesCadastro(Vacinante a, Vacinante b)
            throws ClassNotFoundException, FileNotFoundException, IOException {
        a.remover(a.getCPF());
        b.cadastrar();
    }
}
