import dominio.Pessoa;

public class Exercicio10 {
    public static void executar() {
        /*  Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem
        informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18
        anos como maior de idade. */

        int n = Prompt.lerInteiro("Digite o número de casos: ");
        Pessoa pessoa = new Pessoa(n);

        for (int i = 0; i < n; i++) {
            pessoa.idade[i] = Prompt.lerInteiro("Digite a idade da pessoa " + (i + 1) + ":");
            if (pessoa.idade[i] >= 18) {
                System.out.printf("Pessoa " + (i + 1) + ": maior de idade!\n");
            } else {
                System.out.printf("Pessoa " + (i + 1) + ": menor de idade!\n");
            }
        }

        Prompt.separador();
        
    }
}
