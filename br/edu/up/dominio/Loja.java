package br.edu.up.dominio;

public class Loja {

    public double ps(double preco, double p) {
        return preco / p;
    }
    
    public double pv (double preco, double percentual) {
        double p = 1 + (percentual / 100);
        return preco * p;
    }
}
