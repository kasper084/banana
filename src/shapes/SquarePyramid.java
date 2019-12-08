package shapes;

public class SquarePyramid extends SpaceShape {
    private Vertex vertex = new Vertex();
    private double baseWidth;
    private double height;

    public SquarePyramid(double x, double y, double z, double width, double height) {
        this.vertex.createVertex(x, y, z);
        getVertices3D().add(vertex);
        this.baseWidth = width;
        this.height = height;
        add3DVtoAllV();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return (getBaseS() * getHeight()) / 3;
    }

    public double getBaseS() {
        return getBaseWidth() * getBaseWidth();
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public double getHeight() {
        return height;
    }
}
