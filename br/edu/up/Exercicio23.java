package br.edu.up;
import java.util.*;

import br.edu.up.dominio.Pessoa;

public class Exercicio23 {
    public static void executar() {

        /* Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre
        nome e o seu peso ideal de acordo com as seguintes características da pessoa: */

        Scanner leitor = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Informe o sexo da pessoa (F ou M): ");

        char s = leitor.nextLine().toUpperCase().charAt(0);
        pessoa.setS(s);

        double a = Prompt.lerDecimal("Informe a altura da pessoa, em m: ");
        pessoa.setA(a);

        int i = Prompt.lerInteiro("Informe a idade da pessoa: ");
        pessoa.setI(i);

        double p = pessoa.pesoIdeal();
        pessoa.setP(p);

        System.out.printf("Peso Ideal: %.2f\n", pessoa.getP());
        
        Prompt.separador();
        
    }
}
