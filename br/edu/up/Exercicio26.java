package br.edu.up;
import br.edu.up.dominio.Seguradora;

public class Exercicio26 {
    public static void executar() {

        /* . Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado.
        Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de
        seguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto.
        A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome,
        idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. Caso a
        idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra
        em nenhuma das categorias ofertadas. */

        Seguradora cliente = new Seguradora();

        String nome = Prompt.lerLinha("Digite seu nome: ");
        cliente.setNome(nome);

        int idade = Prompt.lerInteiro("Digite sua idade: ");
        cliente.setIdade(idade);

        String risco = Prompt.lerLinha("Digite seu nível de risco (baixo, medio, alto): ");
        cliente.setRisco(risco);

        if (cliente.getIdade() < 17 || cliente.getIdade() > 70) {
            System.out.println("Idade inválida.");
        } else {
            cliente.setId(cliente.classificar());

            System.out.printf("Nome: %s\nÍndice de risco: %s\nIdade: %d\nCategoria: %d\n", cliente.getNome(), cliente.getRisco(), cliente.getIdade(), cliente.getId());
        }

        Prompt.separador();

    }
}
