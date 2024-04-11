package br.edu.up;
import br.edu.up.dominio.*;

public class Exercicio04 {
    public static void executar() {
        /* Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um
        valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a
        quantidade de dólares disponíveis com o usuário. */

        double a = Prompt.lerDecimal("Digite a cotação do dólar: ");
        double b = Prompt.lerDecimal("Digite a quantidade de dólares: ");

        Conversao conversao = new Conversao();
        double real = conversao.cReal(a, b);

        System.out.printf("A conversão em real(is) fica: R$ %.2f\n", real);
        Prompt.separador();
        
    }
}
