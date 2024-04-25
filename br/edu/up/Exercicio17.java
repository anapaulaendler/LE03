package br.edu.up;
import br.edu.up.dominio.Funcionario;

public class Exercicio17 {
    public static void executar() {

        /*  Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
        reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à
        empresa vai aumentar sua folha de pagamento. */

        int n = Prompt.lerInteiro("Informe o número de funcionários: ");
        Funcionario funcionario = new Funcionario(n);

        double salarioMinimo = Prompt.lerDecimal("Informe o valor do salário mínimo: ");
        funcionario.setSalarioMinimo(salarioMinimo);

        int reajuste = Prompt.lerInteiro("Informe a porcentagem de reajuste: ");
        funcionario.setReajuste(reajuste);

        double folha = 0;
        String[] nome = new String[n];
        double[] s = new double[n];
        double[] ns = new double[n];

        for (int i = 0; i < n; i++) {
            nome[i] = Prompt.lerLinha("Digite o nome do funcionário: ");
            funcionario.setN(nome);

            s[i] = Prompt.lerDecimal("Digite o salário atual do funcionário: ");
            funcionario.setS(s);

            ns[i] = funcionario.novoS2(i);
            funcionario.setNs(ns);

            folha += funcionario.getNs()[i] - funcionario.getS()[i];

        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Nome: %s\nNovo salário: R$ %.2f\n", funcionario.getN()[i], funcionario.getNs()[i]);
        }

        System.out.printf("A folha de pagamento irá aumentar em: R$ %.2f\n", folha);
        Prompt.separador();

    }
}
