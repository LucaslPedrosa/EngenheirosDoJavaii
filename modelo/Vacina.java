package modelo;

import dados.VacinaDados;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Vacina implements Serializable {
    String tipo;
    String data;
    String marca;
    long lote;

    // construtor

    public Vacina() {

    }

    public Vacina(String tipo, String data, String marca, long lote) {
        this.tipo = tipo;
        this.data = data;
        this.marca = marca;
        this.lote = lote;
    }

    // gets e sets
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getLote() {
        return lote;
    }

    public void setLote(long lote) {
        this.lote = lote;
    }

    // Metodos
    // Cadastrar Vacinas

    public void cadastrarVacina() throws FileNotFoundException, IOException, ClassNotFoundException {
        VacinaDados v = new VacinaDados();
        v.cadastrar(this); // Dados do objeto permanece no arquivo disciplinas.txt
    }

    public ArrayList<Vacina> listarVacina() throws FileNotFoundException, IOException, ClassNotFoundException {
        VacinaDados v = new VacinaDados();
        return v.listarVacina();
    }

    public void removerVacina(String marca, long lote)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        VacinaDados v = new VacinaDados();
        v.removerVacina(marca, lote);
    }

    public String imprimir() {
        return "Tipo: " + this.getTipo() + "\nMarca: " + this.getMarca() + "\nLote: " + this.getLote()
                + "\nData de entrada: " + this.getData();
    }
}
