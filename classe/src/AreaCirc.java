public class AreaCirc {

    double raio;
    static final double PI = 3.1415;

    public AreaCirc(double raio) {
        this.raio = raio;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }
}

