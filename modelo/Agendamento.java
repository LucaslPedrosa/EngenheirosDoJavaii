package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import dados.AgendamentoDados;

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

    public void cadastrar() throws IOException, ClassNotFoundException {
        AgendamentoDados AD = new AgendamentoDados();
        AD.cadastrarAgendamento(this);
    }

    public ArrayList<Agendamento> listarAgendamentos() throws IOException, ClassNotFoundException {
        AgendamentoDados AD = new AgendamentoDados();
        return AD.listarAgendamentos();
    }

    public void removerAgendamento(Vacina vacina, String data)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        AgendamentoDados AD = new AgendamentoDados();
        AD.removerAgendamento(vacina, data);
    }

}
