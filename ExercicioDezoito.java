import dominio.Funcionario;
import java.util.*;

public class ExercicioDezoito {
    public static void executar() {
        /* . Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre
        o nome e o salário líquido acrescido do abono conforme o sexo e a idade: */

        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        funcionario.nome = Prompt.lerLinha("Digite o nome do funcionário: ");
        funcionario.salf = Prompt.lerDecimal("Digite o salário fixo do funcionário: ");
        System.out.println("Digite o sexo da pessoa (F ou M): ");
        funcionario.sexo = leitor.nextLine().toUpperCase().charAt(0);
        funcionario.idade = Prompt.lerInteiro("Digite a idade do funcionário: ");

        if (funcionario.sexo == 'F') {
            if (funcionario.idade < 30) {
                funcionario.salf += 80.0;
            } else {
                funcionario.salf += 200.0;
            }
        } else if (funcionario.sexo == 'M') {
            if (funcionario.idade < 30) {
                funcionario.salf += 50.0;
            } else {
                funcionario.salf += 100.0;
            } 
        }

        System.out.printf("O novo salário de %s, conforme seu sexo e idade, é de: R$ %.2f\n", funcionario.nome, funcionario.salf);
        Prompt.separador();

    }
}
