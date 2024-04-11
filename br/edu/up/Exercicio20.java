package br.edu.up;
import br.edu.up.dominio.Funcionario;

public class Exercicio20 {
    public static void executar() {
        /* A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa
        que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
        Professor Nível 1 R$12,00 por hora/aula
        Professor Nível 2 R$17,00 por hora/aula
        Professor Nível 3 R$25,00 por hora/aula */

        
        Funcionario professor = new Funcionario();
        professor.horas = Prompt.lerInteiro("Informe a quantidade de horas trabalhadas: ");
        professor.nivel = Prompt.lerInteiro("Informe o nível do professor (1, 2, 3): ");
        double salario = professor.pagamento();

        System.out.printf("O salário do professor é de: R$ %.2f\n", salario);
        Prompt.separador();

    }
}
