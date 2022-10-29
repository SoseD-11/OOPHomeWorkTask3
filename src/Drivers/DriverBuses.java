package Drivers;

import Transport.Buses;
import Transport.Driver;

public class DriverBuses extends Driver<Buses> {
    public DriverBuses(String fullName, int drivingExperience, Buses car) {
        super(fullName, "D", drivingExperience, car);
    }
}
