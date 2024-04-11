package br.edu.up;
import br.edu.up.dominio.Aluno;

public class Exercicio08 {
    public static void executar() {
        /* Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre.
        Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),
        Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9). */

        Aluno aluno = new Aluno();
        aluno.nome = Prompt.lerLinha("Digite o nome do aluno: ");
        double media = 0;
        aluno.notas = new double[3];

        for (int i = 0; i < 3; i++) {
            aluno.notas[i] = Prompt.lerDecimal("Digite sua nota: ");
            media += aluno.notas[i];
        }

        if ((media / 3) >= 7) {
            System.out.printf("O aluno %s foi aprovado!\n", aluno.nome);
        } else if ((media / 3 <= 5)) {
            System.out.printf("O aluno %s foi reprovado.\n", aluno.nome);
        } else {
            System.out.printf("O aluno %s está em recuperação.\n", aluno.nome);
        }

        Prompt.separador();

    }
}
