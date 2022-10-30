package Drivers;

import Transport.Buses;

public class DriverBuses extends Driver<Buses> {
    public DriverBuses(String fullName, int drivingExperience, Buses car) {
        super(fullName, "D", drivingExperience, car);
    }
}
