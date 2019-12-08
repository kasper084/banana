package shapes;

public class Rectangle extends PlaneShape {
    private Vertex vertex = new Vertex();
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        this.vertex.createVertex(x, y);
        this.width = width;
        this.height = height;
        getVertices2D().add(vertex);
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

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
