package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.ProfSaude;
import modelo.Vacina;
import modelo.Vacinacao;
import modelo.Vacinante;

public class VacinanteControle {
    public void cadastrarVacinante(String nome, String sexo, String nascimento, String problemasDeSaude, long cpf)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinante vt = new Vacinante(nome, sexo, nascimento, problemasDeSaude, cpf);
        vt.cadastrar();
    }

    public void cadastrarVacinante(String nome, String sexo, String nascimento, String problemasDeSaude, long cpf,
            ArrayList<Vacinacao> cartaoVacina) throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinante vt = new Vacinante(nome, sexo, nascimento, problemasDeSaude, cpf, cartaoVacina);
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

    public void addCartaoVacina(String marca, long lote, String data, long numNacionalIdentidade, int dose)
            throws IOException, ClassNotFoundException {
        VacinaControle vacina = new VacinaControle();

        ProfSaudeControle profSaude = new ProfSaudeControle();

        VacinacaoControle vacinacaoCont = new VacinacaoControle();

        vacinacaoCont.cadastrar(vacina.pesquisarVacina(marca, lote).getTipo(),
                vacina.pesquisarVacina(marca, lote).getLote(), data,
                profSaude.pesquisarProfissional(numNacionalIdentidade).getNome(), dose);

        /*
         * Vacinacao a = new Vacinacao(vacina.pesquisarVacina(marca, lote), data,
         * profSaude.pesquisarProfissional(numNacionalIdentidade), dose);
         */

        Vacinante levaPicada = new Vacinante();
        levaPicada.addCartaoVacina(vacinacaoCont.pesquisarVacinacao(data, dose));
    }

    public void removeCartaoVacina(Vacina vacina, String data, int dose) throws IOException, ClassNotFoundException {
        Vacinante levaPicada = new Vacinante();
        levaPicada.removeCartaoVacina(vacina, data, dose);
    }

    public String imprimirCartaoVacina() {
        Vacinante levaPicada = new Vacinante();
        return levaPicada.imprimirCartaoVacina();
    }

    /*
     * public void atualizar(Vacinante vac) throws FileNotFoundException,
     * IOException, ClassNotFoundException { String nome = vac.getNome(); String
     * sexo = vac.getSexo(); String nascimento = vac.getNascimento(); String
     * problemasDeSaude = vac.getProblemasDeSaude(); long cpf = vac.getCPF();
     * ArrayList<Vacinacao> cartaoVacina = vac.getCartaoVacina();
     * 
     * removerVacinante(cpf);
     * 
     * cadastrarVacinante(nome, sexo, nascimento, problemasDeSaude, cpf,
     * cartaoVacina); }
     */

    /*
     * public void agendar(String marca, long lote, String data) throws IOException,
     * ClassNotFoundException { VacinaControle vacina = new VacinaControle();
     * 
     * Vacinante levaPicada = new Vacinante();
     * levaPicada.agendar(vacina.pesquisarVacina(marca, lote), data); }
     * 
     * public void removeAgenda(Vacina vacina, String data) throws IOException,
     * ClassNotFoundException { Vacinante levaPicada = new Vacinante();
     * levaPicada.removeAgenda(vacina, data); }
     * 
     * public String imprimirAgenda() { Vacinante levaPicada = new Vacinante();
     * return levaPicada.imprimirAgenda(); }
     */

    public void salvarAlteracoesCadastro(Vacinante a, Vacinante b)
            throws ClassNotFoundException, FileNotFoundException, IOException {
        a.remover(a.getCPF());
        b.cadastrar();
    }
}
