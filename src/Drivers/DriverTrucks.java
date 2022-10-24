package Drivers;

import Transport.Driver;
import Transport.Trucks;

public class DriverTrucks extends Driver<Trucks> {
    public DriverTrucks(String fullName, int drivingExperience, Trucks car) {
        super(fullName, "C", drivingExperience, car);
    }
}
