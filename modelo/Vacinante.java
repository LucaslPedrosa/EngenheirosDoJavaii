package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import modelo.Vacinacao;

import dados.VacinanteDados;

public class Vacinante extends Pessoa implements Serializable {

    private String sexo;
    private String nascimento;
    private String problemasDeSaude;
    private long cpf;
    private long rg;
    private ArrayList<Vacinacao> cartaoVacina;

    public Vacinante(String nome) {
        super(nome);
    }

    public Vacinante() {
    }

    public Vacinante(String nome, String sexo, String nascimento, String problemasDeSaude, long cpf) {
        super(nome);
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.problemasDeSaude = problemasDeSaude;
        this.cpf = cpf;
    }

    // gets e sets
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
    public void addCartaoVacina(Vacina vacina, String data, ProfSaude proSRes, int dose) {
        Vacinacao vnc = new Vacinacao(vacina, data, proSRes, dose);
        cartaoVacina.add(vnc);
    }

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
        return "Nome: " + super.getNome() + "\nCPF: " + this.getCPF() + "\nRG: " + this.getRG() + "\nNascimento: "
                + this.getNascimento() + "\nSexo: " + this.getSexo() + "\nSexo: " + this.getSexo();
    }

    public String imprimirCartaoVacina() {
        String picadas = "";
        for (int i = 0; i < cartaoVacina.size(); i++) {
            picadas += cartaoVacina.get(i).imprimir() + "\n\n\n";
        }
        return picadas;
    }
}
