package shapes;

public class Triangle extends PlaneShape {

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Vertex vertexA = new Vertex();
        Vertex vertexB = new Vertex();
        Vertex vertexC = new Vertex();
        vertexA.createVertex(x1, y1);
        vertexB.createVertex(x2, y2);
        vertexC.createVertex(x3, y3);
        getVertices2D().add(vertexA);
        getVertices2D().add(vertexB);
        getVertices2D().add(vertexC);
        add2DVtoAllV();
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
