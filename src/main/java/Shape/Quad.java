package Shape;

public class Quad extends Shape {
    private static final String NAME = "Quad";
    private double x;

    public Quad(double x) {
        this.x = x;

    }
    @Override
    public String getName() {
        return NAME;

    }

    @Override
    public double getArea() {
        double areaQuad = x*x;
        return areaQuad;
    }
}
