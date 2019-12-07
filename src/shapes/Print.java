package shapes;

public abstract class Print {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(1,2,9, 5,5,5);
        Triangle triangle = new Triangle(2, 0, 4, 0, 3, 7);
        System.out.println(triangle.getPerimeter());
    }
}
