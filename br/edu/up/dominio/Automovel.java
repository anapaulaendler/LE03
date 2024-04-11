package br.edu.up.dominio;

public class Automovel {

    private double litros;
    private double distancia;
    
    public Automovel(double litros, double distancia){
        this.litros = litros;
        this.distancia = distancia;
    }

    public double cm() {
        return distancia / litros;
    }

    public String tipoCombustivel;
    public double valor;

    public Automovel() {}

    public Automovel(String tipoCombustivel, double valor) {
        this.tipoCombustivel = tipoCombustivel;
        this.valor = valor;
    }

    public double calcularDesconto() {
        double desconto = 0;
        
        if ("alcool".equalsIgnoreCase(tipoCombustivel)) {
            desconto = 0.25 * valor;
        } else if ("gasolina".equalsIgnoreCase(tipoCombustivel)) {
            desconto = 0.21 * valor;
        } else if ("diesel".equalsIgnoreCase(tipoCombustivel)) {
            desconto = 0.14 * valor;
        }
    
        return desconto;
    }
    

}

