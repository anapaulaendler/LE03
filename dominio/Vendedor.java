package dominio;

public class Vendedor {
    
    public String nome;
    public double salf;
    public double totv;

    public Vendedor(String nome, double salf, double totv) {
        this.nome = nome;
        this.salf = salf;
        this.totv = totv;
    }

    public double salario() {
        double conta = salf + (totv * 0.15);
        return conta;
    }
    
}
