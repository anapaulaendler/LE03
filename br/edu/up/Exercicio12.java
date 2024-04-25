package br.edu.up;
import java.util.Scanner;

import br.edu.up.dominio.Concessionaria;

public class Exercicio12 {
    public static void executar() {
        /*  A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com
        desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo
        cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000
        - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto
        até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral. */

        char opcao = 'S';
        Concessionaria concessionaria = new Concessionaria();
        Scanner scanner = new Scanner(System.in);
        int c2000 = 0;
        concessionaria.setC2000(c2000);
        int cGeral = 0;
        concessionaria.setCg(cGeral);

        while (opcao != 'N') {

            int ano = Prompt.lerInteiro("Informe o ano do carro: ");
            concessionaria.setAno(ano);

            double preco = Prompt.lerDecimal("Informe o valor inicial: ");
            concessionaria.setPreco(preco);

            concessionaria.desconto(concessionaria.getAno(), concessionaria.getPreco());

            System.out.println("Deseja continuar? Digite 'n' ou 'N' para sair: ");
            opcao = scanner.nextLine().toUpperCase().charAt(0);

        }

        System.out.printf("O total de carros até o ano 2000: %d.\nTotal de carros: %d.\n", concessionaria.getC2000(), concessionaria.getCg());
        Prompt.separador();
    }
}
