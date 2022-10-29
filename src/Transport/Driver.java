package Transport;

public abstract class Driver <T extends Transport>{
    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    protected Driver(String fullName, String category,
                     int drivingExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public void startMoving() {
        System.out.println("Driver, " + getFullName() + ", start moving");
    }

    public void stopMoving() {
        System.out.println("Driver, " + getFullName() + ", stop moving");
    }

    public void refill() {
        System.out.println("Driver " + getFullName() + " refilling the " +
                car.getBrand() + " " + car.getModel());
    }
    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return String.format("The driver " + getFullName() +
                " drives the car " + car.getBrand() + " " + car.getModel() +
                " and will participate in the race");
    }
}
