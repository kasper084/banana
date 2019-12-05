package car;

public abstract class ElectricCar extends Engine {
    double km;
    double speed;
    private double batterySize;


    public double energyWasted() {
        double physics = 3;
        double wasted = getKm() * physics * getCapacity() / 100;
        if (getSpeed() >= 80) return wasted * 1.5;
        else return wasted;
    }


    public boolean isEmpty() {
        if (energyWasted() >= getBatterySize()) {
            System.out.println("Oh, you run out of battery ლ(ಠ_ಠლ)");
            shutDown();
            return true;
        } else return false;
    }

    public void shutDown() {
        setStarted(false);
    }

    public void startEngine() {
        if (!isEmpty()) {
            setStarted(true);
        }
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
