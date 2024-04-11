package br.edu.up;
import br.edu.up.dominio.Consumo;

public class Exercicio22 {
    public static void executar() {
        /*  Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo
        da conta de luz segue a tabela abaixo:
        Tipo de Cliente Valor do KW/h
        1 (Residência) 0,60
        2 (Comércio) 0,48
        3 (Indústria) 1,29 */

        Consumo consumo = new Consumo();
        consumo.id = Prompt.lerInteiro("Digite seu ID:\n1 - Residência\n2 - Comércio\n3 - Indústria\n");
        consumo.consumo = Prompt.lerInteiro("Digite seu consumo, em KW/h: ");
        consumo.valor();

        Prompt.separador();

    }
}
