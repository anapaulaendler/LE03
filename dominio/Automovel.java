package dominio;

public class Automovel {

    private double litros;
    private double distancia;
    
    public Automovel(double litros, double distancia){
        this.litros = litros;
        this.distancia = distancia;
    }

    public double cm() {
        return distancia / litros;
    }


}

