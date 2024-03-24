package dominio;

public class Triangulo {
    
    public int a;
    public int b;
    public int c;

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
