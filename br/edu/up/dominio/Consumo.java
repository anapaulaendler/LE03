package br.edu.up.dominio;

public class Consumo {
    
    public int id;
    public int consumo;
    public double conta;

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
