package shapes.figures;

import shapes.vertex.Vertex;
import shapes.abstraction.PlaneShape;

public class Rectangle extends PlaneShape {
    private final Vertex VERTEX = new Vertex();
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        VERTEX.createVertex(x, y);
        getVertices2D().add(VERTEX);
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
                + "P = "
                + getPerimeter()
                + ", S = "
                + getArea()
                + ", XY "
                + getVertexValue();
    }


    public String getVertexValue() {
        double x = VERTEX.getX();
        double y = VERTEX.getY();
        String value = "[" + x + " ; " + y + "]";
        return value;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
