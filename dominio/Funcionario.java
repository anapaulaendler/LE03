package dominio;

public class Funcionario {
    
    public String nome;
    public double salf;
    public double totv;
    public char sexo;
    public int idade;

    public Funcionario(String nome, double salf, double totv) {
        this.nome = nome;
        this.salf = salf;
        this.totv = totv;
    }

    public double salario() {
        double conta = salf + (totv * 0.15);
        return conta;
    }

    //

    public String[] n;
    public double[] s;
    public double[] ns;
    public double salarioMinimo;
    public int reajuste;

    public Funcionario(int tamanho) {
        n = new String[tamanho];
        s = new double[tamanho];
        ns = new double[tamanho];
    }

    public Funcionario() {}

    public double novoS(int indice) {

        if (s[indice] < 3 * salarioMinimo) {
            return s[indice] * 1.5; 
        } else if (s[indice] >= 3 * salarioMinimo && s[indice] <= 10 * salarioMinimo) {
            return s[indice] * 1.2; 
        } else if (s[indice] > 10 * salarioMinimo && s[indice] <= 20 * salarioMinimo) {
            return s[indice] * 1.15; 
        } else {
            return s[indice] * 1.1; 
        }
    }
    
    //

    public double novoS2(int indice) {
        ns[indice] = s[indice] * (1 + (reajuste / 100.0));
        return ns[indice];
    }

    //

        public int nivel;
        public int horas;
        public double salario;
    
        public double pagamento() {
            if (nivel == 1) {
                salario = 12.0 * horas;
            } else if (nivel == 2) {
                salario = 17.0 * horas;
            } else if (nivel == 3) {
                salario = 25.0 * horas;
            } else {
                System.out.println("Nível de professor inválido.");
            }
            return salario;
        }
    }
