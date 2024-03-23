import java.util.Scanner;

public class ExercicioDoze {
    public static void executar() {
        /*  A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com
        desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo
        cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000
        - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto
        até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral. */

        char opcao = 'S';
        int ano;
        double preco;
        Scanner scanner = new Scanner(System.in);
        int c2000 = 0;
        int cg = 0;

        while (opcao != 'N') {
            ano = Prompt.lerInteiro("Informe o ano do carro: ");
            preco = Prompt.lerDecimal("Informe o valor inicial: ");

            if (ano <= 2000) {
                preco = preco * 0.88;
                c2000 += 1;
                cg += 1;
            } else {
                preco = preco * 0.93;
                cg += 1;
            }

            System.out.printf("Preço atualizado: R$ %.2f\n", preco);
            System.out.println("Deseja continuar? Digite 'n' ou 'N' para sair: ");
            opcao = scanner.nextLine().toUpperCase().charAt(0);
        }

        System.out.printf("O total de carros até o ano 2000: %d.\nTotal de carros: %d.\n", c2000, cg);
        Prompt.separador();
        scanner.close();
    }
}
