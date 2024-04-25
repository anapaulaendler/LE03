package br.edu.up;
import java.util.*;

import br.edu.up.dominio.*;

public class Exercicio13 {
    public static void executar() {
        /*  Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe
        se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais. */

        int n = Prompt.lerInteiro("Digite o número de casos: ");
        Pessoa candidato = new Pessoa(n);
        Scanner leitor = new Scanner(System.in);

        int[] idade = new int[n];
        String[] nome = new String[n];
        char[] sexo = new char[n];
        boolean[] saude = new boolean[n];

        for (int i = 0; i < n; i++) {

            idade[i] = Prompt.lerInteiro("Digite a idade: ");
            candidato.setIdade(idade);

            nome[i] = Prompt.lerLinha("Digite o nome: ");
            candidato.setNome(nome);

            System.out.println("Digite o sexo (F ou M):");
            sexo[i] = leitor.nextLine().toUpperCase().charAt(0);
            candidato.setSexo(sexo);
            
            System.out.println("Estado de saúde (bom/ruim): ");
            String estadoSaudeInput = leitor.nextLine().toLowerCase();
            
            if (estadoSaudeInput.equals("bom")) {
                saude[i] = true;
                candidato.setSaude(saude);
            } else if (estadoSaudeInput.equals("ruim")) {
                saude[i] = false;
                candidato.setSaude(saude);
            } else {
                System.out.println("Entrada inválida para estado de saúde. Por favor, digite 'bom' ou 'ruim'.");
                i--;
            }
        }
        

        int totalAptas = 0;
        int totalNaoAptas = 0;

        for (int i = 0; i < n; i++) {
            if (candidato.apto(i)) {
                System.out.println(candidato.getNome() + " está apto para o serviço militar.");
                totalAptas++;
            } else {
                System.out.println(candidato.getNome() + " não está apto para o serviço militar.");
                totalNaoAptas++;
            }
        }

        System.out.println("Total de pessoas aptas: " + totalAptas);
        System.out.println("Total de pessoas não aptas: " + totalNaoAptas);

        Prompt.separador();
        
    }
}
