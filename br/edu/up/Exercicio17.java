package br.edu.up;
import br.edu.up.dominio.Funcionario;

public class Exercicio17 {
    public static void executar() {
        /*  Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
        reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à
        empresa vai aumentar sua folha de pagamento. */

        
        int n = Prompt.lerInteiro("Informe o número de funcionários: ");
        Funcionario funcionario = new Funcionario(n);

        funcionario.salarioMinimo = Prompt.lerDecimal("Informe o valor do salário mínimo: ");
        funcionario.reajuste = Prompt.lerInteiro("Informe a porcentagem de reajuste: ");
        double folha = 0;

        for (int i = 0; i < n; i++) {
            funcionario.n[i] = Prompt.lerLinha("Digite o nome do funcionário: ");
            funcionario.s[i] = Prompt.lerDecimal("Digite o salário atual do funcionário: ");
            funcionario.ns[i] = funcionario.novoS2(i);
            folha += funcionario.ns[i] - funcionario.s[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Nome: %s\nNovo salário: R$ %.2f\n", funcionario.n[i], funcionario.ns[i]);
        }

        System.out.printf("A folha de pagamento irá aumentar em: R$ %.2f\n", folha);
        Prompt.separador();

    }
}
