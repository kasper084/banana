package shapes;

public class Vertex {
    private double x;
    private double y;
    private double z;

    public void createVertex(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public void createVertex(double x, double y) {
        setX(x);
        setY(y);
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
