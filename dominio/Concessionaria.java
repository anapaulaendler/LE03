package dominio;

public class Concessionaria {
    
    public double custoC (double cf) {
        double i = cf * 0.45;
        double pd = 0.28 * (cf + i);
        double cc = pd + i + cf;
        return cc;
    }
}
