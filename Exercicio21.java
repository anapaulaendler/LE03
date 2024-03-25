import dominio.Nadador;

public class Exercicio21 {
    public static void executar() {
        /* Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
        Infantil A = 5 - 7 anos
        Infantil B = 8 - 10 anos
        juvenil A = 11- 13 anos
        juvenil B = 14 - 17 anos
        Sênior = 18 - 25 anos
        Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado. */

        Nadador nadador = new Nadador();
        nadador.idade = Prompt.lerInteiro("Digite a idade do nadador: ");

        Nadador.classificarNadador(nadador.idade);
        Prompt.separador();

    }
}
