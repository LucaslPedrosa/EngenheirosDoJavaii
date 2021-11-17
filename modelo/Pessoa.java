package modelo;

import java.io.IOException;

<<<<<<< Updated upstream
public abstract class Pessoa {
=======
<<<<<<< HEAD
    private String nome;
    private String sexo;
    private String nascimento;
    private String[] problemasDeSaude;
    private long cpf;
    private long rg;
    private Vacina[] vacinaAgendada;
    private Vacina[] vacinaUsada;

    // Construtores
    public Pessoa() {
    }
=======
public abstract class Pessoa {
>>>>>>> bc8db88216b5c29d67d69da7a11b4dcccc4e85a3
>>>>>>> Stashed changes

    private String nome;

    public Pessoa() {
    }

<<<<<<< Updated upstream
    public Pessoa(String nome) {
=======
<<<<<<< HEAD
    public Pessoa(String nome, String sexo, String nascimento, long cpf, long rg, Vacina[] vacinaAgendada,
            Vacina[] vacinaUsada, String[] problemasDeSaude) {
=======
    public Pessoa(String nome) {
>>>>>>> bc8db88216b5c29d67d69da7a11b4dcccc4e85a3
>>>>>>> Stashed changes
        this.nome = nome;
    }

    // gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

<<<<<<< Updated upstream
    // Metodos

    public abstract void cadastrar() throws IOException, ClassNotFoundException;
=======
<<<<<<< HEAD
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

    // Metodos

=======
    // Metodos

    public abstract void cadastrar() throws IOException, ClassNotFoundException;
>>>>>>> bc8db88216b5c29d67d69da7a11b4dcccc4e85a3
>>>>>>> Stashed changes
}
