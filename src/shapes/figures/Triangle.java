package shapes.figures;

import shapes.vertex.Vertex;
import shapes.abstraction.PlaneShape;

public class Triangle extends PlaneShape {
    private final Vertex VERTEX_A = new Vertex();
    private final Vertex VERTEX_B = new Vertex();
    private final Vertex VERTEX_C = new Vertex();

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        VERTEX_A.createVertex(x1, y1);
        VERTEX_B.createVertex(x2, y2);
        VERTEX_C.createVertex(x3, y3);
        getVertices2D().add(VERTEX_A);
        getVertices2D().add(VERTEX_B);
        getVertices2D().add(VERTEX_C);
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
                + "P"
                + getPerimeter()
                + " S"
                + getArea()
                + " x1 "
                + VERTEX_A.getX()
                + " y1 "
                + VERTEX_A.getY();

    }



    public double sideA() {
        double side = Math.pow(VERTEX_B.getX() - VERTEX_A.getX(), 2)
                + Math.pow(VERTEX_B.getY() - VERTEX_A.getY(), 2);
        return Math.sqrt(side);
    }

    public double sideB() {
        double side = Math.pow(VERTEX_C.getX() - VERTEX_B.getX(), 2)
                + Math.pow(VERTEX_C.getY() - VERTEX_B.getY(), 2);
        return Math.sqrt(side);
    }

    public double sideC() {
        double side = Math.pow(VERTEX_A.getX() - VERTEX_C.getX(), 2)
                + Math.pow(VERTEX_A.getY() - VERTEX_C.getY(), 2);
        return Math.sqrt(side);
    }

}
