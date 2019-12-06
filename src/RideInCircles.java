import car.Tesla;
import figures.Circle;

public class RideInCircles {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle anotherCircle = new Circle();

        Tesla tesla = new Tesla("S", 4.7, 75);
        tesla.setSpeed(120);
        tesla.setKm(250);
        tesla.startEngine();
        tesla.shutDown();

        System.out.println(tesla.energyWasted() + " energy needed to travel " + tesla.getKm() + " km");

        System.out.println("\nThere are " + Circle.getNumOfKids() + " objects of Figure class");
        System.out.println("Circle area is " + circle.getArea(5.3));
        System.out.println("Area of another circle is " + anotherCircle.getArea(4.2));
    }
}
