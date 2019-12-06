package car;

public abstract class ElectricCar {
    private Engine engine = new Engine();
    private double km;
    private double speed;
    private double batterySize;


    public double energyWasted() {
        double physics = 3;
        double wasted = getKm() * physics * engine.getCapacity() / 100;
        if (getSpeed() >= 80) return wasted * 1.5;
        else return wasted;
    }


    public void isEmpty() {
        if (energyWasted() >= getBatterySize()) {
            shutDown();
            System.out.println("Oh, you run out of battery ლ(ಠ_ಠლ)");
        }
    }

    public void shutDown() {
        if (engine.isStarted()) engine.setStarted(false);
    }

    public void startEngine() {
        engine.setStarted(true);
        isEmpty();
    }


    public void setCapacity(double capacity) {
        engine.setCapacity(capacity);
    }

    public double getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(double size) {
        this.batterySize = size;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
