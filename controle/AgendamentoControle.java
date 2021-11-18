package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Agendamento;
import modelo.ProfSaude;
import modelo.Vacina;

public class AgendamentoControle {

    public void cadastrar(Vacina vacine, String data)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Agendamento agendamento = new Agendamento(vacine, data);
        agendamento.cadastrar();
    }

    public ArrayList<Agendamento> listarAgendamento()
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Agendamento AD = new Agendamento();
        return AD.listarAgendamentos();
    }

    public void removerAgendamento(Vacina vacina, String data)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Agendamento AD = new Agendamento();
        AD.removerAgendamento(vacina, data);
    }

    private Agendamento pesquisarAgendamento(Vacina vacina, String data)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Agendamento AD = null;
        ArrayList<Agendamento> agendamentos = listarAgendamento();
        for (int i = 0; i < agendamentos.size(); i++) {
            if (vacina.equals(agendamentos.get(i).getVacina()) && data.equals(agendamentos.get(i).getData())) {
                agendamentos.remove(i);
                break;
            }
        }
        return AD;
    }

    public String imprimir(Vacina vacina, String data)
            throws ClassNotFoundException, FileNotFoundException, IOException {
        Agendamento AD = pesquisarAgendamento(vacina, data);
        return AD.imprimir();
    }

    public String ImprimirTodos() throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<Agendamento> agendamentos = listarAgendamento();
        String p = "";
        for (int i = 0; i < agendamentos.size(); i++) {
            p += agendamentos.get(i).imprimir() + "\n\n\n";
        }
        return p;
    }

}
