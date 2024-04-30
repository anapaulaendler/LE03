package br.edu.up;
import java.util.Scanner;

import br.edu.up.dominio.Pessoa;

public class Exercicio11 {
    public static void executar() {
    /* Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é
    homem ou mulher. No final informe total de homens e de mulheres. */

    int n = 56;
    Pessoa pessoas = new Pessoa(n);
    
    String[] nome = new String[n];
    char[] sexo = new char[n];
    int cM = 0;
    int cF = 0;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
        nome[i] = Prompt.lerLinha("Digite o nome da pessoa: ");
        pessoas.setNome(nome);

        System.out.println("Digite o sexo da pessoa (F ou M): ");
        sexo[i] = scanner.nextLine().toUpperCase().charAt(0);
        pessoas.setSexo(sexo);

        if (sexo[i] == 'F') {
            cF += 1;
        } else if (sexo[i] == 'M') {
            cM += 1;
        }
    }

    for (int i = 0; i < n; i++) {
        if (sexo[i] == 'F') {
            System.out.println("Nome: " + pessoas.getNome()[i] + " | Mulher");
        } else if (sexo[i] == 'M') {
            System.out.println("Nome: " + pessoas.getNome()[i] + " | Homem");
        }
    }

    System.out.println("Quantidade total de homens: " + cM + ". Quantidade total de mulheres: " + cF + ".");
    Prompt.separador();

}
}
