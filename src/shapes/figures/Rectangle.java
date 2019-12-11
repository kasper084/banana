package shapes.figures;

import shapes.vertex.Vertex2D;
import shapes.abstraction.PlaneShape;

public class Rectangle extends PlaneShape {
    private final Vertex2D vertex = new Vertex2D();
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        vertex.createVertex(x, y);
        getVertices2D().add(vertex);
        add2DVtoAllV();
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getHeight() + getWidth());
    }

    @Override
    public String toString() {
        return super.toString()
                + " P = "
                + Math.floor(getPerimeter())
                + ", S = "
                + Math.floor(getArea());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}