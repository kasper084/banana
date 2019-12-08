package shapes;

public class Sphere extends SpaceShape {

    private Vertex vertex = new Vertex();
    private double radius;

    public Sphere(double x, double y, double radius) {
        this.vertex.createVertex(x, y);
        this.radius = radius;
        getVertices3D().add(vertex);
        add3DVtoAllV();
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
