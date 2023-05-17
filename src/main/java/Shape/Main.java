package Shape;

public class Main {
    public static void main(String[] args){
        Shape circle = new Circle(5);
        Shape ellipse = new Ellipse();
        Shape quad = new Quad(3);
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        new ShapeTests(circle);
        circle.getName();
        new ShapeTests(ellipse);
        ellipse.getName();
        new ShapeTests(quad);
        quad.getName();
        new ShapeTests(rectangle);
        rectangle.getName();
        new ShapeTests(triangle);
        triangle.getName();

    }
}
