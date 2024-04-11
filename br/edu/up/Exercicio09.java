package br.edu.up;
import br.edu.up.dominio.Numero;

public class Exercicio09 {
    public static void executar() {
        /* Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) 
        e 150 (inclusive).  */

        Numero numero = new Numero();
        int a = 0;
        
        
        for (int i = 0; i < 80; i++) {
            a = numero.contador();
        }
        
        System.out.println("Quantidade de números no intervalo [10, 150]: " + a);

    }
}
