package modelo;

import java.io.Serializable;

public class Agendamento implements Serializable {
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

    public String getData() {
        return data;
    }

    public void setVacina(Vacina vacin) {
        this.vacine = vacin;
    }

    public void setData(String data) {
        this.data = data;
    }

    // metodos
    public String imprimir() {
        return "Vacina: " + this.vacine + "\nData: " + this.data;
    }
}
