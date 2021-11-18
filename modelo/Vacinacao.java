package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import dados.VacinacaoDados;

public class Vacinacao implements Serializable {
    Vacina vacina;
    String data;
    ProfSaude proficionalSaude;
    int dose;

    // Construtores
    public Vacinacao(Vacina vacina, String data, ProfSaude proSRes, int dose) {
        this.vacina = vacina;
        this.data = data;
        this.proficionalSaude = proSRes;
        this.dose = dose;
    }

    public Vacinacao() {
    }

    // gets e sets
    public Vacina getVacina() {
        return vacina;
    }

    public String getData() {
        return data;
    }

    public ProfSaude getProficionalSaude() {
        return proficionalSaude;
    }

    public void setVacina(Vacina vacin) {
        this.vacina = vacin;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setProficionalSaude(ProfSaude proSRes) {
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
        return (/* "Vacina: " + this.vacina.getTipo() + */ "\nDose: " + this.dose
                + /* "\nLote: " + this.vacina.getLote() */
                "\nData: " + this.data/* + "\nProfissional de saúde: " + this.proficionalSaude.getNome() */);
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
