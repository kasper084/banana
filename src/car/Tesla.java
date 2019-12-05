package car;

public class Tesla extends ElectricCar {
    String model;

    public Tesla(String model, double capacity, double size) {
        setCapacity(capacity);
        setBatterySize(size);
    }


}
