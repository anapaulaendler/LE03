import dominio.Funcionario;

public class ExercicioDezesste {
    public static void executar() {
        /*  Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
        reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à
        empresa vai aumentar sua folha de pagamento. */

        int n = Prompt.lerInteiro("Informe o número de funcionários: ");
        Funcionario funcionario = new Funcionario(n);
    }
}
