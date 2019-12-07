package shapes;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle extends PlaneShape {
    private Vertex vertexA = new Vertex();
    private Vertex vertexB = new Vertex();
    private Vertex vertexC = new Vertex();

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        vertexA.createVertex(x1, y1);
        vertexB.createVertex(x2, y2);
        vertexC.createVertex(x3, y3);
        getVertices2D().add(vertexA);
        getVertices2D().add(vertexB);
        getVertices2D().add(vertexC);
        add2DVtoAllV();
    }

    public double sideA() {
        double side = pow(vertexB.getX()
                - vertexA.getX(), 2)
                + pow(vertexB.getY()
                - vertexA.getY(), 2);
        return sqrt(side);
    }

    public double sideB() {
        double side = pow(vertexC.getX()
                - vertexB.getX(), 2)
                + pow(vertexC.getY()
                - vertexB.getY(), 2);
        return sqrt(side);
    }

    public double sideC() {
        double side = pow(vertexA.getX()
                - vertexB.getX(), 2)
                + pow(vertexA.getY()
                - vertexB.getY(), 2);
        return sqrt(side);
    }

    @Override
    public double getArea() {
        double area = sideC();
        return area;
    }

    @Override
    public double getPerimeter() {
        return sideA() + sideB() + sideC();
    }
}
