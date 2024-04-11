package br.edu.up.dominio;

public class Aluno {

    public String matricula;
    public String nome;
    public double[] notas;
    
    public double media;
    public char classificacao;

    //Método construtor
    public Aluno(){
    }

    //Método construtor com parâmetro
    public Aluno(String nome){
        this.nome = nome;        
    }

    //Método construtor com parâmetros
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public static char classificacao(double media) {
        if (media >= 8 && media <= 10) {
            return 'A';
        } else if (media >= 7 && media < 8) {
            return 'B';
        } else if (media >= 6 && media < 7) {
            return 'C';
        } else if (media >= 5 && media < 6) {
            return 'D';
        } else {
            return 'R';
        }
    }

    public static void informacoes(Aluno aluno) {
        System.out.println("\nInformações do aluno:");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Número de matrícula: " + aluno.matricula);
        System.out.println("Nota Final: " + aluno.media);
        System.out.println("Classificação: " + aluno.classificacao);
    }

}
