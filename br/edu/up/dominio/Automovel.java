package br.edu.up.dominio;

public class Automovel {

    private double litros;
    private double distancia;
    private String tipoCombustivel;
    private double valor;
    
    // Métodos construtores:

    public Automovel() {}
    
    public Automovel(double litros, double distancia){
        this.litros = litros;
        this.distancia = distancia;
    }

    public Automovel(String tipoCombustivel, double valor) {
        this.tipoCombustivel = tipoCombustivel;
        this.valor = valor;
    }

    // Getters and Setters

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Funcões

    public double cm() {
        return distancia / litros;
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

