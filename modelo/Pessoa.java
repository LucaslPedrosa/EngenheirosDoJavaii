package modelo;

public class Pessoa {

    private String nome;
    private String sexo;
    private String nascimento;
    private String[] problemasDeSaude;
    private long cpf;
    private long rg;
    private Vacina[] vacinaAgendada;
    private Vacina[] vacinaUsada;

    //Construtores
    public Pessoa(){
    }

    public Pessoa(String nome, String sexo, String nascimento, long cpf, long rg) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.rg = rg;

    }

    public Pessoa (String nome, String sexo, String nascimento, long cpf, long rg, Vacina[] vacinaAgendada, Vacina[] vacinaUsada, String[] problemasDeSaude) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.problemasDeSaude = problemasDeSaude;
        this.vacinaAgendada = vacinaAgendada;
        this.vacinaUsada = vacinaUsada;
    }

    //gets e sets

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

//Metodos    
    
}
