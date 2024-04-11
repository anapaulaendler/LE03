package br.edu.up.dominio;

public class Concessionaria {
    
    private int ano;
    private double preco;
    private int cg;
    private int c2000;

    // Métodos Construtores:

    public Concessionaria() {
    }

    public Concessionaria(int ano, double preco) {
        this.ano = ano;
        this.preco = preco;
    }

    public Concessionaria(int ano) {
        this.ano = ano;
    }

    public Concessionaria(double preco) {
        this.preco = preco;
    }

    // Getters and Setters

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCg() {
        return cg;
    }

    public void setCg(int cg) {
        this.cg = cg;
    }

    public int getC2000() {
        return c2000;
    }

    public void setC2000(int c2000) {
        this.c2000 = c2000;
    }

    // Funções


    public double custoC (double cf) {
        double i = cf * 0.45;
        double pd = 0.28 * (cf + i);
        double cc = pd + i + cf;
        return cc;
    }

    public void desconto(int ano, double preco) {
        this.ano = ano;
        this.preco = preco;

        if (ano <= 2000) {
            preco = preco * 0.88;
            c2000 += 1;
            cg += 1;
        } else {
            preco = preco * 0.93;
            cg += 1;
        }

        System.out.printf("Preço atualizado: R$ %.2f\n", preco);

    }
}
