package shapes;

public class Circle extends PlaneShape {
    private final Vertex VERTEX = new Vertex();
    private double radius;

    public Circle(double x, double y, double radius) {
        VERTEX.createVertex(x, y);
        getVertices2D().add(VERTEX);
        add2DVtoAllV();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
