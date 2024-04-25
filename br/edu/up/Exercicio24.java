package br.edu.up;
import br.edu.up.dominio.Aluno;

public class Exercicio24 {
    
    public static void executar() {

        /*  Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas
        atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame
        final. As notas variam, de 0 a 10 e a nota final é a média ponderada das três notas mencionadas.
        A lista abaixo fornece os pesos:
        a. Laboratório: peso 2
        b. Avaliação semestral: peso 3
        c. Exame final: peso 5 */

        Aluno alunoCC = new Aluno();

        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        alunoCC.setNome(nome);

        double[] notas = new double[3];
        double media = 0;

        for (int i = 0; i < 3; i++) {
            notas[i] = Prompt.lerDecimal("Digite sua nota: ");
            alunoCC.setNotas(notas);
        }

        media = (alunoCC.getNotas()[0] * 2 + alunoCC.getNotas()[1] * 3 + alunoCC.getNotas()[2] * 5) / 10;
        alunoCC.setMedia(media);;

        System.out.printf("A média do aluno %s é: %.2f\n", alunoCC.getNome(), alunoCC.getMedia());
        
        Prompt.separador();

    }
}