package shapes.figures;

import shapes.abstraction.PlaneShape;
import shapes.vertex.Vertex2D;

public class Triangle extends PlaneShape {
    private final Vertex2D vertexA = new Vertex2D();
    private final Vertex2D vertexB = new Vertex2D();
    private final Vertex2D vertexC = new Vertex2D();

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
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
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA()) * (p - sideB()) * (p - sideC()));
    }

    @Override
    public double getPerimeter() {
        return sideA() + sideB() + sideC();
    }

    @Override
    public String toString() {
        return super.toString()
                + " P = "
                + Math.floor(getPerimeter())
                + ", S = "
                + Math.floor(getArea());
    }

    public double sideA() {
        double side = Math.pow(vertexB.getX() - vertexA.getX(), 2)
                + Math.pow(vertexB.getY() - vertexA.getY(), 2);
        return Math.sqrt(side);
    }

    public double sideB() {
        double side = Math.pow(vertexC.getX() - vertexB.getX(), 2)
                + Math.pow(vertexC.getY() - vertexB.getY(), 2);
        return Math.sqrt(side);
    }

    public double sideC() {
        double side = Math.pow(vertexA.getX() - vertexC.getX(), 2)
                + Math.pow(vertexA.getY() - vertexC.getY(), 2);
        return Math.sqrt(side);
    }
}