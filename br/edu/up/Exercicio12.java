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
        concessionaria.c2000 = 0;
        concessionaria.cg = 0;

        while (opcao != 'N') {

            concessionaria.ano = Prompt.lerInteiro("Informe o ano do carro: ");
            concessionaria.preco = Prompt.lerDecimal("Informe o valor inicial: ");
            concessionaria.desconto(concessionaria.ano, concessionaria.preco);

            System.out.println("Deseja continuar? Digite 'n' ou 'N' para sair: ");
            opcao = scanner.nextLine().toUpperCase().charAt(0);
        }

        System.out.printf("O total de carros até o ano 2000: %d.\nTotal de carros: %d.\n", concessionaria.c2000, concessionaria.cg);
        Prompt.separador();
    }
}
