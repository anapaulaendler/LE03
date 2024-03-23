import dominio.*;

public class ExercicioUm {
    public static void executar() {
        /* Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve
        no semestre. No final informar o nome do aluno e a sua média (aritmética). */

        Aluno alunoUm = new Aluno();
        alunoUm.nome = Prompt.lerLinha("Digite o nome do aluno: ");

        alunoUm.notas = new double[3];
        double media = 0;

        for (int i = 0; i < 3; i++) {
            alunoUm.notas[i] = Prompt.lerDecimal("Digite sua nota: ");
            media += alunoUm.notas[i];
        }

        System.out.printf("A média do aluno %s é: %.2f\n", alunoUm.nome, (media/3));
        Prompt.separador();
        
    }
}
