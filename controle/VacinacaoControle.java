package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.ProfSaude;
import modelo.Vacina;
import modelo.Vacinacao;

public class VacinacaoControle {

    public void cadastrar(String nomeVacina, long lote, String data, String nomeProSRes, int dose)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinacao vac = new Vacinacao(nomeVacina, lote, data, nomeProSRes, dose);
        vac.cadastrar();
    }

    public ArrayList<Vacinacao> listarVacinacao() throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinacao ps = new Vacinacao();
        return ps.listarVacinacao();
    }

    public void removerVacinacao(Vacina vacina, String data, ProfSaude proSRes, int dose)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinacao ps = new Vacinacao();
        ps.removerVacinacao(vacina, data, proSRes, dose);
    }

    public Vacinacao pesquisarVacinacao(String data, int dose)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacinacao vac = null;
        ArrayList<Vacinacao> vacinacoes = listarVacinacao();
        for (int i = 0; i < vacinacoes.size(); i++) {
            if (data.equals(vacinacoes.get(i).getData()) && dose == vacinacoes.get(i).getDose()) {
                vac = vacinacoes.get(i);
                break;
            }
        }
        return vac;
    }

    public String imprimir(Vacina vacina, String data, ProfSaude proSRes, int dose)
            throws ClassNotFoundException, FileNotFoundException, IOException {
        Vacinacao vac = pesquisarVacinacao(data, dose);
        return vac.imprimir();
    }

    public String ImprimirTodos() throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<Vacinacao> vacinacoes = listarVacinacao();
        String p = "";
        for (int i = 0; i < vacinacoes.size(); i++) {
            p += vacinacoes.get(i).imprimir() + "\n\n\n";
        }
        return p;
    }

}
