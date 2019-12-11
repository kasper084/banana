package shapes.vertex;

public class Vertex2D extends Vertex{
    private double x;
    private double y;

    public void createVertex(double x, double y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return  getX()
                + "; "
                + getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}