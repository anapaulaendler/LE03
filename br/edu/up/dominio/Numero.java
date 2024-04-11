package br.edu.up.dominio;

public class Numero {

    int contador;

    public int contador() {
    int numero = Prompt.lerInteiro("Digite um número: ");
            
    if (numero >= 10 && numero <= 150) {
        contador++;
    }

    return contador;
}
}
