package br.edu.up;
import br.edu.up.dominio.*;

public class Exercicio14 {
    public static void executar() {
        
        /* Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre
        como resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de
        custo e do preço de venda. */

        Produto produto = new Produto(40);
        double mpc = 0;
        double mpv = 0;
        double lucro = 0;
        
        for (int i = 0; i < 40; i++) {
            produto.pc[i] = Prompt.lerDecimal("Digite o preço de custo: ");
            mpc += produto.pc[i];
            produto.pv[i] = Prompt.lerDecimal("Digite o preço de venda: ");
            mpv += produto.pv[i];
        }

        for (int i = 0; i < 40; i++) {
            lucro = produto.l(i);
            if (lucro > 0) {
                System.out.println("O produto número " + (i + 1) + " está dando lucro.");
            } else if (lucro < 0) {
                System.out.println("O produto número " + (i + 1) + " está dando prejuízo.");
            } else {
                System.out.println("O produto número " + (i + 1) + " está dando empate.");
            }
        }

        System.out.printf("A média de preço de custo é de R$ %.2f.\nA média de preço de venda é de: R$ %.2f.\n", (mpc/40), (mpv/40));
        Prompt.separador();

    }
}
