package shapes.vertex;

public class Vertex3D extends Vertex {
    private double x;
    private double y;
    private double z;

    public void create3DVertex(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return getX()
                + "; "
                + getY()
                + "; "
                + getZ();
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