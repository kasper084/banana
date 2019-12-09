package shapes.figures;

import shapes.vertex.Vertex;
import shapes.abstraction.SpaceShape;

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

    @Override
    public String toString() {
        return super.toString()
                + "S = "
                + Math.floor(getArea())
                + ", V = "
                + Math.floor(getVolume())
                + ", XY "
                + getVertexValue();
    }

    public String getVertexValue() {
        double x = VERTEX.getX();
        double y = VERTEX.getY();
        String value = "[" + x + " ; " + y + "]";
        return value;
    }

    public double getRadius() {
        return radius;
    }
}
