package figures;

public class Circle extends Figure {

    public double getArea(double radius) {
        double degree = 2;
        return Math.pow(radius, degree) * Math.PI;
    }

}
