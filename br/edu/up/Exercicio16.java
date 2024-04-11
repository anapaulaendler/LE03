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

        funcionario.salarioMinimo = Prompt.lerDecimal("Informe o valor do salário mínimo: ");

        for (int i = 0; i < n; i++) {
            funcionario.n[i] = Prompt.lerLinha("Digite o nome do funcionário: ");
            funcionario.s[i] = Prompt.lerDecimal("Digite o salário atual do funcionário: ");
            funcionario.ns[i] = funcionario.novoS(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Nome: %s\nNovo salário: R$ %.2f\n", funcionario.n[i], funcionario.ns[i]);
        }

        Prompt.separador();

    }

}
