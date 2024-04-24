package br.edu.up.dominio;

public class Pessoa {
    private String[] nome;
    private char[] sexo;
    private int[] idade;
    private boolean[] saude;

    // métodos construtores:

    public Pessoa() {}

    public Pessoa(int tamanho) {
        this.nome = new String[tamanho];
        this.sexo = new char[tamanho];
        this.idade = new int[tamanho];
        this.saude = new boolean[tamanho];
    }
    
    // getters e setters:

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public char[] getSexo() {
        return sexo;
    }

    public void setSexo(char[] sexo) {
        this.sexo = sexo;
    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }

    public boolean[] getSaude() {
        return saude;
    }

    public void setSaude(boolean[] saude) {
        this.saude = saude;
    }

    public char getS() {
        return s;
    }

    public void setS(char s) {
        this.s = s;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // funções:
    
    public boolean apto(int indice) {
        return (idade[indice] >= 18 && idade[indice] <= 30 && saude[indice]);
    }

    public void maiorDeIdade(int idade, int i) {
        if (idade >= 18) {
            System.out.printf("Pessoa " + (i + 1) + ": maior de idade!\n");
        } else {
            System.out.printf("Pessoa " + (i + 1) + ": menor de idade!\n");
        }
    }

    public char s;
    public double a;
    public int i;
    public double p;
    public double peso;

    public double pesoIdeal() {
        if (s == 'F') {
            if (a > 1.5) {
                peso = (62.1 * a) - 44.7;
            } else {
                if (i < 35) {
                    peso = (62.1 * a) - 49;
                } else {
                    peso = (62.1 * a) - 45;
                }
            }
        } else if (s == 'M') {
            if (a > 1.7) {
                if (i <= 20) {
                    peso = (72.7 * a) - 58;
                } else if (i > 20 && i < 40) {
                    peso = (72.7 * a) - 53;
                } else {
                    peso = (72.7 * a) - 45;
                }
            } else {
                if (i <= 40) {
                    peso = (72.7 * a) - 50;
                } else {
                    peso = (72.7 * a) - 58;
                }
            }
        } else {
            System.out.println("Sexo Inválido.");
            peso = 0;
        }

        return peso;
    }
}
