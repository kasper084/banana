package shapes;

public abstract class Print {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(1, 2, 9, 7, 9, 5);
        Triangle triangle = new Triangle(2, 0, 3, 7, 4, 0);
        Circle circle = new Circle(1,1, 9);

        System.out.println(circle.getPerimeter() + " " + circle.getArea());
        System.out.println(Math.round(triangle.getPerimeter()));
        System.out.println(Math.round(triangle.getArea()));
        System.out.println(cuboid.getArea() + " " + cuboid.getVolume());
    }
}
