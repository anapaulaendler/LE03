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
}
