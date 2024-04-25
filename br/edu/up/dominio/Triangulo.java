package br.edu.up.dominio;

public class Triangulo {
    
    private int a;
    private int b;
    private int c;

    // métodos construtores:

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangulo() {
    }

    // getters e setters:

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    // funções:  

    public int verificar(int a, int b, int c) {
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            return 1;
        } else {
            return 0;
        }
    }

    public String lados(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            if (a == b && b == c) {
                return "Equilátero";
            } else {
                return "Isóceles";
            }
        } else {
            return "Escaleno";
        }
    }


}
