package shapes;

public class Cuboid extends SpaceShape{
    double width;
    double height;
    double depth;

    public Cuboid(double x1, double y1, double z1, double width, double height, double depth) {
        Vertex vertexA = new Vertex();
        vertexA.createVertex(x1, y1, z1);
        getVertices3D().add(vertexA);
        this.width = width;
        this.height = height;
        this.depth = depth;
        add3DVtoAllV();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
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
