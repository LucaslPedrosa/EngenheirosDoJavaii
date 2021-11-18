package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import dados.VacinanteDados;

public class Vacinante implements Serializable {

    private String nome;
    private String sexo;
    private String nascimento;
    private String problemasDeSaude;
    private long cpf;
    private long rg;
    private ArrayList<Vacinacao> cartaoVacina = new ArrayList<>();
    private ArrayList<Agendamento> agenda = new ArrayList<>();

    public Vacinante(String nome) {
        this.nome = nome;
    }

    public Vacinante() {
    }

    public Vacinante(String nome, String sexo, String nascimento, String problemasDeSaude, long cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.problemasDeSaude = problemasDeSaude;
        this.cpf = cpf;

        Vacinacao v = new Vacinacao();
        Agendamento a = new Agendamento();

        this.cartaoVacina.add(v);
        this.agenda.add(a);
    }

    // gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getProblemasDeSaude() {
        return problemasDeSaude;
    }

    public void setProblemasDeSaude(String problemasDeSaude) {
        this.problemasDeSaude = problemasDeSaude;
    }

    public long getCPF() {
        return cpf;
    }

    public void setCPF(long cpf) {
        this.cpf = cpf;
    }

    public long getRG() {
        return rg;
    }

    public void setRG(long rg) {
        this.rg = rg;
    }

    // metodos
    public void cadastrar() throws IOException, ClassNotFoundException {
        VacinanteDados vd = new VacinanteDados();
        vd.cadastrarVacinante(this);
    }

    public ArrayList<Vacinante> listarVaciante() throws FileNotFoundException, IOException, ClassNotFoundException {
        VacinanteDados vd = new VacinanteDados();
        return vd.listarVacinante();
    }

    public void remover(long cpf) throws FileNotFoundException, IOException, ClassNotFoundException {
        VacinanteDados vd = new VacinanteDados();
        vd.remover(cpf);
    }

    public String imprimirCadastro() {
        return ("Nome: " + this.nome + "\nCPF: " + this.getCPF() + "\nRG: " + this.getRG() + "\nNascimento: "
                + this.getNascimento() + "\nSexo: " + this.getSexo());
    }

    public void addCartaoVacina(Vacinacao vac)
            throws IOException, ClassNotFoundException {
        Vacinacao vnc = new Vacinacao(vacina, data, proSRes, dose);
        cartaoVacina.add(vc);

        VacinanteDados vudu = new VacinanteDados();
        vudu.atualizarVacinante(this);
    }

    public void removeCartaoVacina(Vacina vacina, String data, int dose) throws IOException, ClassNotFoundException {
        Vacinacao v = null;
        for (int i = 0; i < cartaoVacina.size(); i++) {
            if (vacina.equals(cartaoVacina.get(i).getVacina()) && data.equals(cartaoVacina.get(i).getData())
                    && cartaoVacina.get(i).getDose() == dose) {
                v = cartaoVacina.get(i); // Caso retorne nullPointer, significa que não foi encontrado
                break;
            }
        }
        cartaoVacina.remove(v);

        VacinanteDados vudu = new VacinanteDados();
        vudu.atualizarVacinante(this);
    }

    public String imprimirCartaoVacina() {
        String picadas = "";
        for (int i = 0; i < cartaoVacina.size(); i++) {
            picadas += cartaoVacina.get(i).imprimir() + "\n\n\n";
        }
        return picadas;
    }

    public void agendar(Vacina vacine, String data) throws IOException, ClassNotFoundException {
        Agendamento novo = new Agendamento(vacine, data);
        agenda.add(novo);

        VacinanteDados vudu = new VacinanteDados();
        vudu.atualizarVacinante(this);
    }

    public void removeAgenda(Vacina vacina, String data) throws IOException, ClassNotFoundException {
        Agendamento a = null;
        for (int i = 0; i < agenda.size(); i++) {
            if (vacina.equals(agenda.get(i).getVacina()) && data.equals(agenda.get(i).getData())) {
                a = agenda.get(i); // Caso retorne nullPointer, significa que não foi encontrado
                break;
            }
        }
        agenda.remove(a);

        VacinanteDados vudu = new VacinanteDados();
        vudu.atualizarVacinante(this);
    }

    public String imprimirAgenda() { // Como a agenda serve para hipoteticamente ser mostrada no celular da pessoa,
                                     // esse método provavelmente não será usado nesta aplicação
        String FuturasPicadas = "";
        for (int i = 0; i < agenda.size(); i++) {
            FuturasPicadas += agenda.get(i).imprimir() + "\n\n\n";
        }
        return FuturasPicadas;
    }

}
