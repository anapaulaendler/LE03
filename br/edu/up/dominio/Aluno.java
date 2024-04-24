package br.edu.up.dominio;

public class Aluno {

    private String matricula;
    private String nome;
    private double[] notas;
    private double media;
    private char classificacao;

    // Métodos Construtores:
    
    public Aluno(){
    }

    public Aluno(String nome){
        this.nome = nome;        
    }

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    // Setters and Getters

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double[] getNotas() {
        return notas;
    }
    
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double getMedia() {
        return media;
    }
    
    public void setMedia(double media) {
        this.media = media;
    }
    
    public char getClassificacao() {
        return classificacao;
    }
    
    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }
        
    // Funcões
    
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