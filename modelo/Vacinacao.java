package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import dados.VacinacaoDados;

public class Vacinacao implements Serializable {
    String vacina;
    String data;
    String proficionalSaude;
    int dose;
    long lote;

    // Construtores
    public Vacinacao(String nomeVacina, long lote, String data, String nomeProSRes, int dose) {
        this.vacina = nomeVacina;
        this.data = data;
        this.proficionalSaude = nomeProSRes;
        this.dose = dose;
        this.lote = lote;
    }

    public Vacinacao() {
    }

    // gets e sets
    public String getVacina() {
        return vacina;
    }

    public String getData() {
        return data;
    }

    public String getProficionalSaude() {
        return proficionalSaude;
    }

    public long getLote() {
        return this.lote;
    }

    public void setLote(long lote) {
        this.lote = lote;
    }

    public void setVacina(String vacin) {
        this.vacina = vacin;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setProficionalSaude(String proSRes) {
        this.proficionalSaude = proSRes;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    // metodos
    public String imprimir() {
        return ("Vacina: " + this.vacina + "\nDose: " + this.dose + "\nLote: " + this.lote + "\nData: " + this.data
                + "\nProfissional de saúde: " + this.proficionalSaude);
    }

    public void cadastrar() throws IOException, ClassNotFoundException {
        VacinacaoDados vd = new VacinacaoDados();
        vd.cadastrarProf(this);
    }

    public ArrayList<Vacinacao> listarVacinacao() throws IOException, ClassNotFoundException {
        VacinacaoDados vd = new VacinacaoDados();
        return vd.listarVacinacoes();
    }

    public void removerVacinacao(Vacina vac, String data, ProfSaude proSRes, int dose)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        VacinacaoDados vd = new VacinacaoDados();
        vd.removerVacinacao(vac, data, proSRes, dose);
    }
}
