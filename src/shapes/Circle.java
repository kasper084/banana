package shapes;

public class Circle extends PlaneShape {
    private Vertex vertex = new Vertex();
    private double radius;

    public Circle(double x, double y, double radius) {
        this.vertex.createVertex(x, y);
        this.radius = radius;
        getVertices2D().add(vertex);
        add2DVtoAllV();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
}
