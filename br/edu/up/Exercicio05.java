package br.edu.up;
import br.edu.up.dominio.Loja;

public class Exercicio05 {
    public static void executar() {
        /* A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
        Faça um programa que receba um valor de uma compra e mostre o valor das prestações. */

        Loja mamao = new Loja();

        System.out.print("Bem-vindo a loja Mamão com Açúcar! :)\n");
        double a = Prompt.lerDecimal("Digite o valor de sua compra! ");

        double p = mamao.prestacao(a, 5);

        System.out.printf("O valor de cada prestação é de: R$ %.2f\n", p);
        Prompt.separador();
        
    }
}
