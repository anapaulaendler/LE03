import java.util.*;
import dominio.Pessoa;

public class ExercicioVinteETres {
    public static void executar() {
        /* Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre
        nome e o seu peso ideal de acordo com as seguintes características da pessoa: */

        Scanner leitor = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Informe o sexo da pessoa (F ou M): ");
        pessoa.s = leitor.nextLine().toUpperCase().charAt(0);
        pessoa.a = Prompt.lerDecimal("Informe a altura da pessoa, em m: ");
        pessoa.i = Prompt.lerInteiro("Informe a idade da pessoa: ");
        pessoa.p = pessoa.pesoIdeal();

        System.out.printf("Peso Ideal: %.2f\n", pessoa.p);
        Prompt.separador();
        leitor.close();
        
    }
}
