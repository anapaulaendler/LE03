package dominio;

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


}
