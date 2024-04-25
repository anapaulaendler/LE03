package br.edu.up.dominio;

public class Produto {
    
    private double pc[];
    private double pv[];

    // métodos construtores:

    public Produto() {}

    public Produto(int n) {
        pc = new double[n];
        pv = new double[n];
    }

    // getters e setters:

    public double[] getPc() {
        return pc;
    }

    public void setPc(double[] pc) {
        this.pc = pc;
    }

    public double[] getPv() {
        return pv;
    }

    public void setPv(double[] pv) {
        this.pv = pv;
    }

    // funções:

    public double l(int i) {
        return pv[i] - pc[i];
    }

}
