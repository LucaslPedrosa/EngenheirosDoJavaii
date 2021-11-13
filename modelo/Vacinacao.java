package modelo;

public class Vacinacao {
    Vacina vacine;
    String data;
    ProfSaude proficionalSaude;

    // Construtores
    public Vacinacao() {
    }

    public Vacinacao(Vacina vacine, String data, ProfSaude proSRes) {
        this.vacine = vacine;
        this.data = data;
        this.proficionalSaude = proSRes;
    }

    // gets e sets
    public Vacina getVacina() {
        return vacine;
    }

    public String data() {
        return data;
    }

    public ProfSaude getProficionalSaude() {
        return proficionalSaude;
    }

    public void setVacina(Vacina vacin) {
        this.vacine = vacin;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setProficionalSaude(ProfSaude proSRes) {
        this.proficionalSaude = proSRes;
    }

    // metodos

}
