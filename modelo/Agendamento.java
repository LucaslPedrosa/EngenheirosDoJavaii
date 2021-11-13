package modelo;

public class Agendamento {
    Vacina vacine;
    String data;

    // Construtores
    public Agendamento() {
    }

    public Agendamento(Vacina vacine, String data) {
        this.vacine = vacine;
        this.data = data;
    }

    // gets e sets
    public Vacina getVacina() {
        return vacine;
    }

    public String data() {
        return data;
    }

    public void setVacina(Vacina vacin) {
        this.vacine = vacin;
    }

    public void setData(String data) {
        this.data = data;
    }

    // metodos

}
