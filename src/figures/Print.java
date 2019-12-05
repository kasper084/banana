package figures;

public abstract class Print extends Figure {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle anotherCircle = new Circle();
        System.out.println("There are " + getNumOfKids() + " objects of Figure class");
        System.out.println("Circle area is " + circle.getArea(5.3));
        System.out.println("Area of another circle is " + anotherCircle.getArea(4.2));
    }
}
