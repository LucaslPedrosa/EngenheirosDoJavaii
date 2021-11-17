package modelo;

import java.io.IOException;

public abstract class Pessoa {

    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodos

    public abstract void cadastrar() throws IOException, ClassNotFoundException;
}