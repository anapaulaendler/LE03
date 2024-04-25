package br.edu.up;
import br.edu.up.dominio.Triangulo;

public class Exercicio19 {
    public static void executar() {

        /* . Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de
        um triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou
        escaleno.
        Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos
        comprimentos dos outros dois lados.
        Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
        Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todo
        triângulo equilátero é também isóscele;
        Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes. */

        Triangulo triangulo = new Triangulo();
        triangulo.a = Prompt.lerInteiro("Digite o primeiro valor: ");
        triangulo.b = Prompt.lerInteiro("Digite o segundo valor: ");
        triangulo.c = Prompt.lerInteiro("Digite o terceiro valor: ");

        int i = triangulo.verificar(triangulo.a, triangulo.b, triangulo.c);
        
        if (i == 1) {
            String tipo = triangulo.lados(triangulo.a, triangulo.b, triangulo.c);
            System.out.println("O triângulo é do tipo: " + tipo);
        } else {
            System.out.println("Não é triângulo.");
        }

        Prompt.separador();

    }
}
