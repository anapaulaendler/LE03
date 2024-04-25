package br.edu.up;
import br.edu.up.dominio.*;

public class Exercicio14 {
    public static void executar() {

        /* Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre
        como resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de
        custo e do preço de venda. */

        int n = 40;

        Produto produto = new Produto(n);
        double mpc = 0;
        double mpv = 0;
        double lucro = 0;

        double[] pC = new double [n];
        double[] pV = new double[n];
        
        for (int i = 0; i < n; i++) {
            pC[i] = Prompt.lerDecimal("Digite o preço de custo: ");
            produto.setPc(pC);

            mpc += produto.getPc()[i];

            pV[i] = Prompt.lerDecimal("Digite o preço de venda: ");
            produto.setPv(pV);

            mpv += produto.getPv()[i];
        }

        for (int i = 0; i < n; i++) {
            lucro = produto.l(i);
            if (lucro > 0) {
                System.out.println("O produto número " + (i + 1) + " está dando lucro.");
            } else if (lucro < 0) {
                System.out.println("O produto número " + (i + 1) + " está dando prejuízo.");
            } else {
                System.out.println("O produto número " + (i + 1) + " está dando empate.");
            }
        }

        System.out.printf("A média de preço de custo é de R$ %.2f.\nA média de preço de venda é de: R$ %.2f.\n", (mpc/n), (mpv/40));
        Prompt.separador();

    }
}
