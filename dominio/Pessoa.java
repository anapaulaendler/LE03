package dominio;

public class Pessoa {
    public String[] nome;
    public char[] sexo;
    public int[] idade;
    public boolean[] saude;

    public Pessoa() {}

    public Pessoa(int tamanho) {
        nome = new String[tamanho];
        sexo = new char[tamanho];
        idade = new int[tamanho];
        saude = new boolean[tamanho];
    }
    
    public boolean apto(int indice) {
        return (idade[indice] >= 18 && idade[indice] <= 30 && saude[indice]);
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
