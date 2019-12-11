package shapes.figures;

import shapes.abstraction.SpaceShape;
import shapes.vertex.Vertex3D;

public class Sphere extends SpaceShape {
    private final Vertex3D vertex = new Vertex3D();
    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        vertex.create3DVertex(x, y, z);
        getVertices3D().add(vertex);
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
                + " S = "
                + Math.floor(getArea())
                + ", V = "
                + Math.floor(getVolume());
    }

    public double getRadius() {
        return radius;
    }
}