package shapes;

public class Cuboid extends SpaceShape {
    private Vertex vertex = new Vertex();
    private double width;
    private double height;
    private double depth;

    public Cuboid(double x, double y, double z, double width, double height, double depth) {
        this.vertex.createVertex(x, y, z);
        getVertices3D().add(vertex);
        this.width = width;
        this.height = height;
        this.depth = depth;
        add3DVtoAllV();
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
