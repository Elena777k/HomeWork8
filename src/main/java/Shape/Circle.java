package Shape;

public class Circle extends Shape {
    private static final String NAME = "Circle";
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String getName() {
        return NAME;

    }

    @Override
    public double getArea() {
        double areaCircle = (Math.PI * radius * radius);
        return areaCircle;
    }
}
