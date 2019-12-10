package shapes.figures;

import shapes.vertex.Vertex;
import shapes.abstraction.PlaneShape;

public class Circle extends PlaneShape {
    private final Vertex VERTEX = new Vertex();
    private double radius;

    public Circle(double x, double y, double radius) {
        VERTEX.createVertex(x, y);
        getVertices2D().add(VERTEX);
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
                + "P = "
                + Math.floor(getPerimeter())
                + ", S = "
                + Math.floor(getArea())
                + ", XY "
                + getVertexValue();
    }

    public String getVertexValue() {
        double x = VERTEX.getX();
        double y = VERTEX.getY();
        String value = "[" + x + " ; " + y + "]";
        return value;
    }

    public double getRadius() {
        return radius;
    }
}
