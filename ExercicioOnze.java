import dominio.Pessoa;
import java.util.Scanner;

public class ExercicioOnze {
    public static void executar() {
    /* Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é
    homem ou mulher. No final informe total de homens e de mulheres. */

    Pessoa pessoas = new Pessoa();
    pessoas.nome = new String[56];
    pessoas.sexo = new char[56];
    Scanner scanner = new Scanner(System.in);
    int cm = 0;
    int cf = 0;

    for (int i = 0; i < 10; i++) {
        pessoas.nome[i] = Prompt.lerLinha("Digite o nome da pessoa: ");
        System.out.println("Digite o sexo da pessoa (F ou M): ");
        pessoas.sexo[i] = scanner.nextLine().toUpperCase().charAt(0);

        if (pessoas.sexo[i] == 'F') {
            cf += 1;
        } else if (pessoas.sexo[i] == 'M') {
            cm += 1;
        }
    }

    for (int i = 0; i < 10; i++) {
        if (pessoas.sexo[i] == 'F') {
            System.out.println("Nome: " + pessoas.nome[i] + " | Mulher");
        } else if (pessoas.sexo[i] == 'M') {
            System.out.println("Nome: " + pessoas.nome[i] + " | Homem");
        }
    }

    System.out.println("Quantidade total de homens: " + cm + ". Quantidade total de mulheres: " + cf + ".");
    Prompt.separador();

    scanner.close();
}
}
