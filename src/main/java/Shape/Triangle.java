package Shape;

import Shape.Shape;

public class Triangle extends Shape {
    private static final String NAME = "Triangle";
    private double x;
    private double y;
    private double z;

    public Triangle() {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String getName() {
        return NAME;
    }


    @Override
    public double getArea() {
        double p = (x + y + z) / 2;
        double areaTriangle = Math.sqrt(p * (p - x) * (p - y) * (p - z));
        return areaTriangle;
    }
}



