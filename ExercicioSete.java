import dominio.*;

public class ExercicioSete {
    public static void executar() {
        /* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
        distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a
        percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja
        de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe
        o custo ao consumidor do mesmo. */

        double a = Prompt.lerDecimal("Informe o custo de fábrica, em reais: ");
        Concessionaria consumidor = new Concessionaria();
        double r = consumidor.custoC(a);

        System.out.printf("O custo do consumidor é de: R$ %.2f\n", r);
        Prompt.separador();
        
    }
}
