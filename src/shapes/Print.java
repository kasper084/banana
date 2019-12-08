package shapes;

public abstract class Print {
    public static void main(String[] args) {
        SquarePyramid squarePyramid = new SquarePyramid(1,1,1, 7, 5);
        Cuboid cuboid = new Cuboid(1, 2, 9, 7, 9, 5);
        Sphere sphere = new Sphere(1,1, 5);
        Triangle triangle = new Triangle(2, 0, 3, 7, 4, 0);
        Circle circle = new Circle(1,1, 9);
        Rectangle rectangle = new Rectangle(1,1,7,5);
        System.out.println(circle.getPerimeter() + " " + circle.getArea());
        System.out.println(Math.round(triangle.getPerimeter()));
        System.out.println(Math.round(triangle.getArea()));
        System.out.println(cuboid.getArea() + " " + cuboid.getVolume());
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
        System.out.println(squarePyramid.getArea() + " " + squarePyramid.getSideArea() + " "
                + squarePyramid.getBaseArea());
        System.out.println(sphere.getArea() + " " + sphere.getVolume());
    }
}
