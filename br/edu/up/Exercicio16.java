package br.edu.up;
import br.edu.up.dominio.*;

public class Exercicio16 {

    public static void executar() {

        /* Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionários
        de acordo com os seguintes critérios:
        a) 50% para aqueles que ganham menos do que três salários mínimos;
        b) 20% para aqueles que ganham entre três até dez salários mínimos;
        c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        d) 10% para os demais funcionários. */

        int n = 584;
        Funcionario funcionario = new Funcionario(n);

        double salarioMinimo = Prompt.lerDecimal("Informe o valor do salário mínimo: ");
        funcionario.setSalarioMinimo(salarioMinimo);

        String[] nome = new String[n];
        double[] s = new double[n];
        double[] ns = new double[n];

        for (int i = 0; i < n; i++) {
            nome[i] = Prompt.lerLinha("Digite o nome do funcionário: ");
            funcionario.setN(nome);

            s[i] = Prompt.lerDecimal("Digite o salário atual do funcionário: ");
            funcionario.setS(s);

            ns[i] = funcionario.novoS(i);
            funcionario.setNs(ns);

        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Nome: %s\nNovo salário: R$ %.2f\n", funcionario.getN()[i], funcionario.getNs()[i]);
        }

        Prompt.separador();

    }

}
