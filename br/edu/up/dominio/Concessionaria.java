package br.edu.up.dominio;

public class Concessionaria {
    
    public double custoC (double cf) {
        double i = cf * 0.45;
        double pd = 0.28 * (cf + i);
        double cc = pd + i + cf;
        return cc;
    }

    public int ano;
    public double preco;
    public int cg;
    public int c2000;

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
