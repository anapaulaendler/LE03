import dominio.Seguradora;

public class ExercicioVinteESeis {
    public static void executar() {
        /* . Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado.
        Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de
        seguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto.
        A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome,
        idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. Caso a
        idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra
        em nenhuma das categorias ofertadas. */

        Seguradora cliente = new Seguradora();
        cliente.nome = Prompt.lerLinha("Digite seu nome: ");
        cliente.idade = Prompt.lerInteiro("Digite sua idade: ");
        cliente.risco = Prompt.lerLinha("Digite seu nível de risco (baixo, medio, alto): ");

        if (cliente.idade < 17 || cliente.idade > 70) {
            System.out.println("Idade inválida.");
        } else {
            cliente.id = cliente.classificar();

            System.out.printf("Nome: %s\nÍndice de risco: %s\nIdade: %d\nCategoria: %d\n", cliente.nome, cliente.risco, cliente.idade, cliente.id);
        }

        Prompt.separador();

    }
}
