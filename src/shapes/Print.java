package shapes;

import shapes.abstraction.Shape;
import shapes.figures.*;

import java.util.ArrayList;

public class Print {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        SquarePyramid squarePyramid = new SquarePyramid(1, 1, 1, 7, 5);
        Cuboid cuboid = new Cuboid(1, 2, 9, 7, 9, 5);
        Sphere sphere = new Sphere(1, 1, 5);
        Triangle triangle = new Triangle(2, 0, 3, 7, 4, 0);
        Circle circle = new Circle(1, 1, 9);
        Rectangle rectangle = new Rectangle(1, 1, 7, 5);
        shapes.add(squarePyramid);
        shapes.add(sphere);
        shapes.add(cuboid);
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(rectangle);

        System.out.println();

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
