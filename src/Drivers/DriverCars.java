package Drivers;

import Transport.Cars;

public class DriverCars extends Driver<Cars> {
    public DriverCars(String fullName, int drivingExperience, Cars car) {
        super(fullName, "B", drivingExperience, car);
    }
}
