package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.Agendamento;
import modelo.Vacina;

public class AgendamentoDados {

    public void cadastrarAgendamento(Agendamento age) throws IOException, ClassNotFoundException {
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        File arq = new File("listarAgendamentos.ser");
        if (arq.exists())
            agendamentos = listarAgendamentos();

        agendamentos.add(age);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(agendamentos);
        }
    }

    public ArrayList<Agendamento> listarAgendamentos()
            throws IOException, ClassNotFoundException, FileNotFoundException {
        ArrayList<Agendamento> agendamentos;
        File arq = new File("listarAgendamentos.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream readOb = new ObjectInputStream(fluxo);
        agendamentos = (ArrayList<Agendamento>) readOb.readObject();
        readOb.close();
        return agendamentos;
    }

    public void removerAgendamento(Vacina vacina, String data)
            throws IOException, FileNotFoundException, ClassNotFoundException, NullPointerException {
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        File arq = new File("listarAgendamento.ser");
        if (arq.exists())
            agendamentos = listarAgendamentos();

        for (int i = 0; i < agendamentos.size(); i++) {
            if (vacina.equals(agendamentos.get(i).getVacina()) && data.equals(agendamentos.get(i).getData())) {
                agendamentos.remove(i);
                break;
            }
        }
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravaOb = new ObjectOutputStream(fluxo)) {
            gravaOb.writeObject(agendamentos);
        }
    }
}