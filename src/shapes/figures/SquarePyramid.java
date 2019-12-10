package shapes.figures;

import shapes.vertex.Vertex;
import shapes.abstraction.SpaceShape;

public class SquarePyramid extends SpaceShape {
    private final Vertex VERTEX = new Vertex();
    private double baseWidth;
    private double height;

    public SquarePyramid(double x, double y, double z, double width, double height) {
        VERTEX.createVertex(x, y, z);
        getVertices3D().add(VERTEX);
        add3DVtoAllV();
        this.baseWidth = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return getBaseArea() + getSideArea();
    }

    @Override
    public double getVolume() {
        return (getBaseArea() * getHeight()) / 3;
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

    public double getSideArea() {
        return (getBasePerimeter() * getApo()) / 2;
    }

    public double getApo() {
        return Math.sqrt(Math.pow(getBaseWidth() / 2, 2)
                + Math.pow(getHeight(), 2));
    }

    public double getBasePerimeter() {
        return 4 * getBaseWidth();
    }

    public double getBaseArea() {
        return getBaseWidth() * getBaseWidth();
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public double getHeight() {
        return height;
    }
}
