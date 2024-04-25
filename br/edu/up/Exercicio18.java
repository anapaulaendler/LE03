package br.edu.up;
import java.util.*;

import br.edu.up.dominio.Funcionario;

public class Exercicio18 {
    public static void executar() {

        /* . Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre
        o nome e o salário líquido acrescido do abono conforme o sexo e a idade: */

        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        String nome = Prompt.lerLinha("Digite o nome do funcionário: ");
        funcionario.setNome(nome);

        double salf = Prompt.lerDecimal("Digite o salário fixo do funcionário: ");
        funcionario.setSalf(salf);

        System.out.println("Digite o sexo da pessoa (F ou M): ");

        char sexo = leitor.nextLine().toUpperCase().charAt(0);
        funcionario.setSexo(sexo);

        int idade = Prompt.lerInteiro("Digite a idade do funcionário: ");
        funcionario.setIdade(idade);

        if (funcionario.getSexo() == 'F') {
            if (funcionario.getIdade() < 30) {

                salf = funcionario.getSalf() + 80.0;
                funcionario.setSalf(salf);

            } else {

                salf = funcionario.getSalf() + 200.0;
                funcionario.setSalf(salf);

            }
        } else if (funcionario.getSexo() == 'M') {
            if (funcionario.getIdade() < 30) {

                salf = funcionario.getSalf() + 50.0;
                funcionario.setSalf(salf);

            } else {

                salf = funcionario.getSalf() + 100.0;
                funcionario.setSalf(salf);

            } 
        }

        System.out.printf("O novo salário de %s, conforme seu sexo e idade, é de: R$ %.2f\n", funcionario.getNome(), funcionario.getSalf());
        Prompt.separador();

    }
}
