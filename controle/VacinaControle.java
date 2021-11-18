package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Vacina;

public class VacinaControle {
    public void cadastrarVacina(String tipo, String data, String marca, long lote)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacina v = new Vacina(tipo, data, marca, lote);
        v.cadastrarVacina();
    }

    public ArrayList<Vacina> listarVacina() throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacina v = new Vacina();
        return v.listarVacina();
    }

    public void removerVacina(String marca, long lote)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacina v = new Vacina();
        v.removerVacina(marca, lote);
    }

    public Vacina pesquisarVacina(String marca, long lote)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Vacina v = null;
        ArrayList<Vacina> vacinas = listarVacina();
        for (int i = 0; i < vacinas.size(); i++) {
            if (marca.equals(vacinas.get(i).getMarca()) && lote == vacinas.get(i).getLote()) {
                v = vacinas.get(i);
                break;
            }
        }
        return v;
    }

    public String imprimir(String marca, long lote) throws ClassNotFoundException, FileNotFoundException, IOException {
        Vacina v = pesquisarVacina(marca, lote);
        return v.imprimir();
    }

    public String ImprimirTodos() throws ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<Vacina> vacinas = listarVacina();
        String p = "";
        for (int i = 0; i < vacinas.size(); i++) {
            p += vacinas.get(i).imprimir() + "\n\n\n";
        }
        return p;
    }
}
