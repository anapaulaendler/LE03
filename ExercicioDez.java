public class ExercicioDez {
    public static void executar() {
        /*  Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem
        informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18
        anos como maior de idade. */

        int n = Prompt.lerInteiro("Digite o número de casos: ");
        int[] pessoas = new int[n];

        for (int i = 0; i < n; i++) {
            pessoas[i] = Prompt.lerInteiro("Digite a idade da pessoa " + (i + 1) + ":");
            if (pessoas[i] >= 18) {
                System.out.printf("Pessoa " + (i + 1) + ": maior de idade!\n");
            } else {
                System.out.printf("Pessoa " + (i + 1) + ": menor de idade!\n");
            }
        }

        Prompt.separador();
        
    }
}
