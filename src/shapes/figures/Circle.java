package shapes.figures;

import shapes.vertex.Vertex2D;
import shapes.abstraction.PlaneShape;

public class Circle extends PlaneShape {
    private final Vertex2D vertex = new Vertex2D();
    private double radius;

    public Circle(double x, double y, double radius) {
        vertex.createVertex(x, y);
        getVertices2D().add(vertex);
        add2DVtoAllV();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return super.toString()
                + " P = "
                + Math.floor(getPerimeter())
                + ", S = "
                + Math.floor(getArea());
    }

    public double getRadius() {
        return radius;
    }
}