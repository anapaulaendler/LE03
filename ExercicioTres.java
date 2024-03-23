import dominio.Funcionario;

public class ExercicioTres {
    public static void executar() {
        /* Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas
        efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
        suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. */

        String a = Prompt.lerLinha("Digite o nome do vendedor: ");
        double b = Prompt.lerDecimal("Digite seu salário fixo: ");
        double c = Prompt.lerDecimal("Digite seu total de vendas: ");

        Funcionario vendedor = new Funcionario(a, b, c);
        double salario = vendedor.salario();

        System.out.printf("O salário final do funcionário %s é de R$ %.2f\n", a, salario);

    }
}
