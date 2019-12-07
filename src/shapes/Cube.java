package shapes;

public class Cube  extends SpaceShape{
    public Cube(double x1, double y1, double z1) {
        Vertex vertexA = new Vertex();
        vertexA.createVertex(x1, y1, z1);
        getVertices3D().add(vertexA);
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
}
