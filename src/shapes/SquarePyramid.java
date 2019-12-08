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
        return getBaseArea() + getSideArea();
    }

    @Override
    public double getVolume() {
        return (getBaseArea() * getHeight()) / 3;
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
