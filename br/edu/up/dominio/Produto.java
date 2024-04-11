package br.edu.up.dominio;

public class Produto {
    
    public double pc[];
    public double pv[];

    public Produto(int n) {
        pc = new double[n];
        pv = new double[n];
    }

    public double l(int i) {
        return pv[i] - pc[i];
    }

}
