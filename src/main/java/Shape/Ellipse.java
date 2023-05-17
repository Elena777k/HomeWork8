package Shape;

class Ellipse extends Shape {
    private static final String NAME = "Ellipse";
    private double minRadius;
    private double maxRadius;

    public Ellipse() {
        this.minRadius = minRadius;
        this.maxRadius = maxRadius;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        double areaEllipse = (Math.PI * minRadius * maxRadius);
        return areaEllipse;
    }
}
