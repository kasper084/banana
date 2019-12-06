package car;

public class Tesla extends ElectricCar {
    private String model;

    public Tesla(String model, double capacity, double size) {
        setCapacity(capacity);
        setBatterySize(size);
        this.model = model;
    }


}
