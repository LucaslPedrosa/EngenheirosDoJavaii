package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import dados.ProfSaudeDados;

public class ProfSaude extends Pessoa implements Serializable {
    String adress;
    long numNacionalIdentidade;

    public ProfSaude() {
    }

    public ProfSaude(String nome, String endereco, long numIdentidade) {
        super(nome);
        this.adress = endereco;
        this.numNacionalIdentidade = numIdentidade;
    }

    // gets e sets

    public String getTipo() {
        return "Proficional de Saude";
    }

    public String getAdress() {
        return adress;
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

    public ArrayList<ProfSaude> listarProficionais() throws IOException, ClassNotFoundException {
        ProfSaudeDados ps = new ProfSaudeDados();
        return ps.listarProficionais();
    }

    public void removerProficional(long numNacionalIdentidade)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ProfSaudeDados ps = new ProfSaudeDados();
        ps.removerProficional(numNacionalIdentidade);
    }

    public String imprimir() {
        return "Tipo: " + this.getTipo() + "\nEndereço:" + this.getAdress() + "\nNumero nacional de identificação: "
                + this.getNumNacionalIdentidade();
    }

}
