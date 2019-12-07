package shapes;

public abstract class Print {
    public static void main(String[] args) {
        Cube cube = new Cube(1,2,9);
        Triangle triangle = new Triangle(2, 0, 4, 0, 3, 7);
        System.out.println(triangle.getVertices2D());
        System.out.println(cube.getVertices3D());
        System.out.println();
    }
}
