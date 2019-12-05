package car;

public class Ride {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("S", 4.7, 75);
        tesla.setSpeed(120);
        tesla.setKm(250);
        tesla.startEngine();
        tesla.shutDown();
        System.out.println("Energy needed " + tesla.energyWasted());
    }
}
