import dominio.*;
import java.util.*;

public class Exercicio13 {
    public static void executar() {
        /*  Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe
        se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais. */

        int n = Prompt.lerInteiro("Digite o número de casos: ");
        Pessoa candidato = new Pessoa(n);
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            candidato.idade[i] = Prompt.lerInteiro("Digite a idade: ");
            candidato.nome[i] = Prompt.lerLinha("Digite o nome: ");
            System.out.println("Digite o sexo (F ou M):");
            candidato.sexo[i] = leitor.nextLine().toUpperCase().charAt(0);
            
            System.out.println("Estado de saúde (bom/ruim): ");
            String estadoSaudeInput = leitor.nextLine().toLowerCase();
            
            if (estadoSaudeInput.equals("bom")) {
                candidato.saude[i] = true;
            } else if (estadoSaudeInput.equals("ruim")) {
                candidato.saude[i] = false;
            } else {
                System.out.println("Entrada inválida para estado de saúde. Por favor, digite 'bom' ou 'ruim'.");
                i--;
            }
        }
        

        int totalAptas = 0;
        int totalNaoAptas = 0;

        for (int i = 0; i < n; i++) {
            if (candidato.apto(i)) {
                System.out.println(candidato.nome[i] + " está apto para o serviço militar.");
                totalAptas++;
            } else {
                System.out.println(candidato.nome[i] + " não está apto para o serviço militar.");
                totalNaoAptas++;
            }
        }

        System.out.println("Total de pessoas aptas: " + totalAptas);
        System.out.println("Total de pessoas não aptas: " + totalNaoAptas);
        Prompt.separador();
        
        leitor.close();
    }
}
