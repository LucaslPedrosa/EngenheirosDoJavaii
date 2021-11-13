package modelo;

import java.io.IOException;

public class ProfSaude extends Pessoa {
    String adress;
    long numNacionalIdentidade;

    public ProfSaude() {
    }

    public ProfSaude(String endereco, long numIdentidade) {
        this.adress = endereco;
        this.numNacionalIdentidade = numIdentidade;
    }

    // gets e sets

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

    }
}
