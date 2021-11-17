package visao;

import controle.*;

public class teste {
    public static void main(String[] args) throws Exception {
        // VacinaControle vacina = new VacinaControle();

        // vacina.cadastrarVacina("Covid 2019", "01.01.2029", "Pifaizer", 40028922); ok
        // System.out.println(vacina.imprimir("Pifaizer", 40028922)); ok
        // System.out.println(vacina.ImprimirTodos()); ok

        /*
         * (Eu executei o código de cima algumas vezes pra salvar a mesma coisa mais de
         * uma vez e depois voltei apagando) vacina.removerVacina("Pifaizer", 40028922);
         * ok System.out.println(vacina.ImprimirTodos());
         */

        // ProfSaudeControle ProfSaude = new ProfSaudeControle(); // ok
        // ProfSaude.cadastrar("Tacinho fofinho", "Rua dos bobos, numero 0", 40028922);
        // ok
        // System.out.println(ProfSaude.imprimir(40028922)); ok
        /*
         * ProfSaude.removerProfSaude(40028922); ok
         * System.out.println(ProfSaude.ImprimirTodos());
         */

        VacinanteControle vacinante = new VacinanteControle();
        // vacinante.cadastrarVacinante("Roger roger", "Battledroid", "Geonosis",
        // "Bateria fraca", 40028922); ok
        // System.out.println(vacinante.imprimirCadastro(40028922)); ok

        // vacinante.removerVacinante(40028922); ok
        // System.out.println(vacinante.ImprimirTodosCadastros()); ok

    }
}
