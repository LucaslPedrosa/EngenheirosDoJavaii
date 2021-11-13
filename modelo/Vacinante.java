package modelo;

import java.io.IOException;

import dados.VacinanteDados;

public class Vacinante extends Pessoa {

    private String sexo;
    private String nascimento;
    private String[] problemasDeSaude;
    private long cpf;
    private long rg;
    private Vacina[] vacinaAgendada;
    private Vacina[] vacinaUsada;

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

    public String[] getProblemasDeSaude() {
        return problemasDeSaude;
    }

    public void setProblemasDeSaude(String[] problemasDeSaude) {
        this.problemasDeSaude = problemasDeSaude;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public Vacina[] getVacinaAgendada() {
        return vacinaAgendada;
    }

    public void setVacinaAgendada(Vacina[] vacinaAgendada) {
        this.vacinaAgendada = vacinaAgendada;
    }

    public Vacina[] getVacinaUsada() {
        return vacinaUsada;
    }

    public void setVacinaUsada(Vacina[] vacinaUsada) {
        this.vacinaUsada = vacinaUsada;
    }

    // metodos

    public void cadastrar() throws IOException, ClassNotFoundException {
        VacinanteDados vd = new VacinanteDados();
        vd.cadastrar(this);
    }

    public void cadastrarVacinação() {
        VacinanteDados vd = new VacinanteDados();

    }

}
