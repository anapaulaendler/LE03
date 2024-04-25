package br.edu.up.dominio;

public class Seguradora {
    
    private String nome;
    private String risco;
    private int idade;
    private int id;

    // métodos construtores:

    public Seguradora() {
    }

    // getters e setters:

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // funções:

    public int classificar() {
        if ("baixo".equalsIgnoreCase(risco)) {
            if (idade >= 17 && idade < 21) {
                id = 1;
            } else if (idade >= 21 && idade <= 24) {
                id = 2;
            } else if (idade >= 25 && idade <= 34) {
                id = 3;
            } else if (idade >= 35 && idade <= 64) {
                id = 4;
            } else if (idade >= 65 && idade <= 70) {
                id = 7;
            } 
        } else if ("medio".equalsIgnoreCase(risco)) {
            if (idade >= 17 && idade < 21) {
                id = 2;
            } else if (idade >= 21 && idade <= 24) {
                id = 3;
            } else if (idade >= 25 && idade <= 34) {
                id = 4;
            } else if (idade >= 35 && idade <= 64) {
                id = 5;
            } else if (idade >= 65 && idade <= 70) {
                id = 8;
            } 
        } else if ("alto".equalsIgnoreCase(risco)) {
            if (idade >= 17 && idade < 21) {
                id = 3;
            } else if (idade >= 21 && idade <= 24) {
                id = 4;
            } else if (idade >= 25 && idade <= 34) {
                id = 5;
            } else if (idade >= 35 && idade <= 64) {
                id = 6;
            } else if (idade >= 65 && idade <= 70) {
                id = 9;
            } 
        }
        return id;
    }
}