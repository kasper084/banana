package shapes.figures;

import shapes.abstraction.SpaceShape;
import shapes.vertex.Vertex3D;

public class Cuboid extends SpaceShape {
    private final Vertex3D vertex = new Vertex3D();
    private double width;
    private double height;
    private double depth;

    public Cuboid(double x, double y, double z, double width, double height, double depth) {
        vertex.create3DVertex(x, y, z);
        getVertices3D().add(vertex);
        add3DVtoAllV();
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return (getWidth() * getHeight() + getWidth() * getDepth() + getHeight() * getDepth() * 2);
    }

    @Override
    public double getVolume() {
        return getDepth()
                * getHeight()
                * getWidth();
    }

    @Override
    public String toString() {
        return super.toString()
                + " S = "
                + Math.floor(getArea())
                + ", V = "
                + Math.floor(getVolume());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}
