package br.edu.up;
import br.edu.up.dominio.Pessoa;

public class Exercicio10 {
    public static void executar() {
        
        /*  Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem
        informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18
        anos como maior de idade. */

        int n = Prompt.lerInteiro("Digite o número de casos: ");
        Pessoa pessoa = new Pessoa(n);
        int idade = 0;

        for (int i = 0; i < n; i++) {
            idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i + 1) + ":");
            pessoa.maiorDeIdade(idade, i);
        }

        Prompt.separador();
        
    }
}
