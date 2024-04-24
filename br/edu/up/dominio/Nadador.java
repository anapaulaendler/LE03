package br.edu.up.dominio;

public class Nadador {

    private int idade;

    // métodos construtores:
    
    public Nadador() {
    }

    public Nadador(int idade) {
        this.idade = idade;
    }

    // getters e setters:

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void classificarNadador(int idade) {

        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade fora da faixa etária.");
        }
}
}