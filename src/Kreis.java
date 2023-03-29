public class Kreis extends Grundform {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double berechneFläche() {
        return Math.PI * radius * radius;
    }

    @Override
    public double berechneUmfang() {
        return Math.PI * radius * 2;
    }
}
