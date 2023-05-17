package Shape;

import Shape.Shape;

public class Rectangle extends Shape {
    private static final String NAME = "Rectangle";
    private double x;
    private double y;
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle() {

    }


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        double areaRectangle = x*y;
        return areaRectangle;
    }
}
