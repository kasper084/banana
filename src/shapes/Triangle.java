package shapes;

public class Triangle extends PlaneShape {
    private Vertex vertexA = new Vertex();
    private Vertex vertexB = new Vertex();
    private Vertex vertexC = new Vertex();

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.vertexA.createVertex(x1, y1);
        this.vertexB.createVertex(x2, y2);
        this.vertexC.createVertex(x3, y3);
        getVertices2D().add(vertexA);
        getVertices2D().add(vertexB);
        getVertices2D().add(vertexC);
        add2DVtoAllV();
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

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA()) * (p - sideB()) * (p - sideC()));
    }

    @Override
    public double getPerimeter() {
        return sideA() + sideB() + sideC();
    }
}
