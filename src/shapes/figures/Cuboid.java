package shapes.figures;

import shapes.vertex.Vertex;
import shapes.abstraction.SpaceShape;

public class Cuboid extends SpaceShape {
    private final Vertex VERTEX = new Vertex();
    private double width;
    private double height;
    private double depth;

    public Cuboid(double x, double y, double z, double width, double height, double depth) {
        VERTEX.createVertex(x, y, z);
        getVertices3D().add(VERTEX);
        add3DVtoAllV();
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * getDepth() * getWidth()
                + 2 * getHeight() * getDepth()
                + 2 * getHeight() * getWidth();
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
                + "S = "
                + Math.floor(getArea())
                + ", V = "
                + Math.floor(getVolume())
                + ", XYZ "
                + getVertexValue();
    }

    public String getVertexValue() {
        double x = VERTEX.getX();
        double y = VERTEX.getY();
        double z = VERTEX.getZ();
        String value = "[" + x + "; " + y + "; " + z + "]";
        return value;
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
