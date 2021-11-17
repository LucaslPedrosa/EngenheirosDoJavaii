package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import dados.ProfSaudeDados;

public class ProfSaude implements Serializable {
    private String nome;
    private String adress;
    long numNacionalIdentidade;

    public ProfSaude() {
    }

    public ProfSaude(String nome, String endereco, long numIdentidade) {
        this.nome = nome;
        this.adress = endereco;
        this.numNacionalIdentidade = numIdentidade;
    }

    // gets e sets

    public String getTipo() {
        return "Proficional de Saude";
    }

    public String getAdress() {
        return this.adress;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getNumNacionalIdentidade() {
        return numNacionalIdentidade;
    }

    public void setNumNacionalIdentidade(long numNacionalIdentidade) {
        this.numNacionalIdentidade = numNacionalIdentidade;
    }

    // metodos

    public void cadastrar() throws IOException, ClassNotFoundException {
        ProfSaudeDados ps = new ProfSaudeDados();
        ps.cadastrarProf(this);
    }

    public ArrayList<ProfSaude> listarProfissionais() throws IOException, ClassNotFoundException {
        ProfSaudeDados ps = new ProfSaudeDados();
        return ps.listarProfissionais();
    }

    public void removerProfissional(long numNacionalIdentidade)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaudeDados ps = new ProfSaudeDados();
        ps.removerProfissional(numNacionalIdentidade);
    }

    public String imprimir() {
        return "Tipo: " + this.getTipo() + "\nEndereço: " + this.getAdress() + "\nNumero nacional de identificação: "
                + this.getNumNacionalIdentidade();
    }

}
