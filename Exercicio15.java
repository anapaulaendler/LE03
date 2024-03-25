import dominio.*;

public class Exercicio15 {
    public static void executar() {
        /* . A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça
        um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto
        deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina
        – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total de
        desconto e total pago pelos clientes. */

        double totalDesconto = 0;
        double totalPago = 0;
        double valor = 1;
        
        while (valor != 0) {
            valor = Prompt.lerDecimal("Digite o valor do veículo (para encerrar, digite 0): ");
            if (valor == 0) {
                break;
            }
            String tipoCombustivel = Prompt.lerLinha("Digite o tipo de combustível (alcool, gasolina, diesel): ");

            Automovel veiculo = new Automovel(tipoCombustivel, valor);
            double desconto = veiculo.calcularDesconto();
            totalDesconto += desconto;
            double valorPago = valor - desconto;
            totalPago += valorPago;

            System.out.printf("Desconto: R$ %.2f\n", desconto);
            System.out.printf("Valor a ser pago: R$ %.2f\n", valorPago);
        }

        System.out.printf("Total de desconto: R$ %.2f\n", totalDesconto);
        System.out.printf("Total pago pelos clientes: R$ %.2f\n", totalPago);
        Prompt.separador();
    }
}
