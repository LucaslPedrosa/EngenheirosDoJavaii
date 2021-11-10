package modelo;

public class Vacina {
    String tipo;
    String data;
    String marca;
    long lote;
    int dose;

    // construtor

    Vacina() {

    }

    public Vacina(String tipo, String data, String marca, long lote, int dose) {
        this.tipo = tipo;

        this.dose = dose;
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

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    // Metodos
    //Cadastrar Vacinas
    public void cadastrarVacinas(){
        
    }
}