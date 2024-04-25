package br.edu.up;
import br.edu.up.dominio.*;

public class Exercicio25 {

    public static void executar() {
        Aluno aluno = new Aluno();

        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        aluno.setNome(nome);

        String matricula = Prompt.lerLinha("Digite o número de matrícula: ");
        aluno.setMatricula(matricula);

        double[] notas = new double[3];

        for (int i = 0; i < 3; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + ": ");
            aluno.setNotas(notas);
        }

        double media = (aluno.getNotas()[0] * 2 + aluno.getNotas()[1] * 3 + aluno.getNotas()[2] * 5) / 10.0;
        aluno.setMedia(media);
        Aluno.classificacao(aluno.getMedia());

        System.out.printf("Nome: %s\nNúmero de matricula: %s\nNota final: %.2f\nClassificação: %c\n", aluno.getNome(), aluno.getMatricula(), aluno.getMedia(), aluno.getClassificacao());
        
        Prompt.separador();
        
    }
}

