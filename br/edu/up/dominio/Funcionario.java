package br.edu.up.dominio;

public class Funcionario {
    
    private String nome;
    private double salf;
    private double totv;
    private char sexo;
    private int idade;

    private String[] n;
    private double[] s;
    private double[] ns;

    private double salarioMinimo;
    
    private int reajuste;
    private int nivel;
    private int horas;
    private double salario;

    // métodos construtores:

    public Funcionario(String nome, double salf, double totv) {
        this.nome = nome;
        this.salf = salf;
        this.totv = totv;
    }

    public Funcionario(int tamanho) {
        n = new String[tamanho];
        s = new double[tamanho];
        ns = new double[tamanho];
    }

    public Funcionario() {}

    // funções:

    public double salario() {
        double conta = salf + (totv * 0.15);
        return conta;
    }

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

    public double novoS2(int indice) {
        ns[indice] = s[indice] * (1 + (reajuste / 100.0));
        return ns[indice];
    }
    
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

        // getters e setters:
        
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSalf() {
            return salf;
        }

        public void setSalf(double salf) {
            this.salf = salf;
        }

        public double getTotv() {
            return totv;
        }

        public void setTotv(double totv) {
            this.totv = totv;
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String[] getN() {
            return n;
        }

        public void setN(String[] n) {
            this.n = n;
        }

        public double[] getS() {
            return s;
        }

        public void setS(double[] s) {
            this.s = s;
        }

        public double[] getNs() {
            return ns;
        }

        public void setNs(double[] ns) {
            this.ns = ns;
        }

        public double getSalarioMinimo() {
            return salarioMinimo;
        }

        public void setSalarioMinimo(double salarioMinimo) {
            this.salarioMinimo = salarioMinimo;
        }

        public int getReajuste() {
            return reajuste;
        }

        public void setReajuste(int reajuste) {
            this.reajuste = reajuste;
        }

        public int getNivel() {
            return nivel;
        }

        public void setNivel(int nivel) {
            this.nivel = nivel;
        }

        public int getHoras() {
            return horas;
        }

        public void setHoras(int horas) {
            this.horas = horas;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }


    