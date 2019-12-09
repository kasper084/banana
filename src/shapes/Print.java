package shapes;

import java.util.ArrayList;

public abstract class Print {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        SquarePyramid squarePyramid = new SquarePyramid(1,1,1, 7, 5);
        Cuboid cuboid = new Cuboid(1, 2, 9, 7, 9, 5);
        Sphere sphere = new Sphere(1,1, 5);
        Triangle triangle = new Triangle(2, 0, 3, 7, 4, 0);
        Circle circle = new Circle(1,1, 9);
        Rectangle rectangle = new Rectangle(1,1,7,5);
        shapes.add(squarePyramid);
        shapes.add(sphere);
        shapes.add(cuboid);
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(rectangle);



        /*System.out.println(circle.getPerimeter() + " " + circle.getArea());
        System.out.println(Math.round(triangle.getPerimeter()));
        System.out.println(Math.round(triangle.getArea()));
        System.out.println(cuboid.getArea() + " " + cuboid.getVolume());
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
        System.out.println(squarePyramid.getArea() + " " + squarePyramid.getSideArea() + " "
                + squarePyramid.getBaseArea());
        System.out.println(sphere.getArea() + " " + sphere.getVolume());*/
    }
}
