package br.edu.up;
import br.edu.up.dominio.*;

public class Exercicio25 {

    public static void executar() {
        Aluno aluno = new Aluno();
        aluno.nome = Prompt.lerLinha("Digite o nome do aluno: ");
        aluno.matricula = Prompt.lerLinha("Digite o número de matrícula: ");

        aluno.notas = new double[3];

        for (int i = 0; i < 3; i++) {
            aluno.notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + ": ");
        }

        aluno.media = (aluno.notas[0] * 2 + aluno.notas[1] * 3 + aluno.notas[2] * 5) / 10.0;
        aluno.classificacao = Aluno.classificacao(aluno.media);

        System.out.printf("Nome: %s\nNúmero de matricula: %s\nNota final: %.2f\nClassificação: %c\n", aluno.nome, aluno.matricula, aluno.media, aluno.classificacao);
        Prompt.separador();
        
    }
}

