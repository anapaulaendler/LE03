package br.edu.up;
import br.edu.up.dominio.*;

public class Exercicio06 {
    public static void executar() {
        /*  Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
        Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo
        usuário */

        double a = Prompt.lerDecimal("Digite o preço de custo do produto: ");
        double b = Prompt.lerDecimal("Digite o percentual de lucro: ");

        Loja venda = new Loja();
        double vv = venda.valorVenda(a, b);

        System.out.printf("O valor de venda é de R$ %.2f\n", vv);
        Prompt.separador();

    }
}
