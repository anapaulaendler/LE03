package br.edu.up;
import br.edu.up.dominio.*;

public class Exercicio02 {
    public static void executar() {
        /*  Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a
        distância total percorrida pelo automóvel e o total de combustível gasto. */

        Automovel automovel = new Automovel();

        double a = Prompt.lerDecimal("Digite o consumo, em litros: ");
        automovel.setLitros(a);
        double b = Prompt.lerDecimal("Digite a distância total, em quilômetros: ");
        automovel.setDistancia(b);

        double consumo = automovel.cm();

        System.out.printf("O consumo médio é de %.2f km/l\n", consumo);
        Prompt.separador();

    }
}
