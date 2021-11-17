package modelo;

import java.io.Serializable;

public class Vacinacao implements Serializable {
    Vacina vacina;
    String data;
    ProfSaude proficionalSaude;
    int dose;

    // Construtores
    public Vacinacao() {
    }

    public Vacinacao(Vacina vacina, String data, ProfSaude proSRes, int dose) {
        this.vacina = vacina;
        this.data = data;
        this.proficionalSaude = proSRes;
        this.dose = dose;
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
        return "Vacina: " + this.vacina.getTipo() + "Dose: " + this.dose + "Lote: " + this.vacina.getLote() + "\nData: "
                + this.data + "\nProfissional de saúde: " + this.proficionalSaude.getNome();
    }
}
