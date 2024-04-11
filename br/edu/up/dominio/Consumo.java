package br.edu.up.dominio;

public class Consumo {
    
    private int id;
    private int consumo;
    private double conta;

    // Métodos Construtores:

    public Consumo() {
    }

    public Consumo(int id, int consumo, double conta) {
        this.id = id;
        this.consumo = consumo;
        this.conta = conta;
    }

    public Consumo(double conta) {
        this.conta = conta;
    }

    public Consumo(int id) {
        this.id = id;
    }

    // Getters and Setters:
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    // Funções:

    public void valor() {
        if (id == 1) {
            conta = consumo * 0.6;
            System.out.printf("Conta: R$ %.2f\n", conta);
        } else if (id == 2) {
            conta = consumo * 0.48;
            System.out.printf("Conta: R$ %.2f\n", conta);
        } else if (id == 3) {
            conta = consumo * 1.28;
            System.out.printf("Conta: R$ %.2f\n", conta);
        } else {
            System.out.println("ID inválido.");
        }
    }
}
