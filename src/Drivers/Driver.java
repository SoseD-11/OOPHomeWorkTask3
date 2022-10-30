package Drivers;

import Transport.Transport;

import java.util.Objects;

public abstract class Driver <T extends Transport>{
    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    protected Driver(String fullName, String category,
                     int drivingExperience, T car) {
        this.fullName = fullName;
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }else {
            this.category = category;
        }
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
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", category='" + category + '\'' +
                ", drivingExperience=" + drivingExperience +
                ", car=" + car +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName) && Objects.equals(category, driver.category) && Objects.equals(car, driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, category, drivingExperience, car);
    }
}
