package br.edu.up;
import br.edu.up.dominio.*;

public class Exercicio01 {
    public static void executar() {
        /* Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve
        no semestre. No final informar o nome do aluno e a sua média (aritmética). */

        Aluno alunoUm = new Aluno();
        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        alunoUm.setNome(nome);

        double media = 0;
        double[] nota = new double[3];

        for (int i = 0; i < 3; i++) {
            nota[i] = Prompt.lerDecimal("Digite sua nota: ");
            alunoUm.setNotas(nota);
            media += nota[i];
        }

        System.out.printf("A média do aluno %s é: %.2f\n", alunoUm.getNome(), (media/3f));
        Prompt.separador();
        
    }
}
