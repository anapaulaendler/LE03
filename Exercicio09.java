public class Exercicio09 {
    public static void executar() {
        int contador = 0;
        
        for (int i = 0; i < 80; i++) {
            int numero = Prompt.lerInteiro("Digite um número: ");
            
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        
        System.out.println("Quantidade de números no intervalo [10, 150]: " + contador);

    }
}
