package shapes;

public class Sphere extends SpaceShape {

    private final Vertex VERTEX = new Vertex();
    private double radius;

    public Sphere(double x, double y, double radius) {
        VERTEX.createVertex(x, y);
        getVertices3D().add(VERTEX);
        add3DVtoAllV();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(getRadius(), 3)) / 3;
    }

    public double getRadius() {
        return radius;
    }
}
