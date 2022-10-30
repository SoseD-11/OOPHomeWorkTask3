package Transport;

import Drivers.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
   /* private final int productionYears;
    private final String productionCountry;
    private String color;
    private int maxSpeed;*/


    public Transport(String brand,
                     String model,
                     float engineVolume/*, int productionYears, String productionCountry, String color, int maxSpeed*/) {

        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
            if (engineVolume <= 0) {
                this.engineVolume = 1.5f;
            } else {
                this.engineVolume = engineVolume;
            }

    }
       /* if (productionYears <= 0) {
            this.productionYears = 2000;
        } else {
            this.productionYears = productionYears;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        this.setColor(color);
        this.setMaxSpeed(maxSpeed);
    }*/


    /*public abstract void circleIndicators();*/

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void printType();

    public abstract boolean service();
    public abstract void repair();


    /* public int getProductionYears() {
        return productionYears;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == 0) {
            this.maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }

    }*/
@Override
public String toString() {
    return "Transport{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", engineVolume=" + engineVolume +
            '}';
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }




/*  public String toString() {
        return "Transport brand : " + brand + ", model : " + model +
                ", engineVolume : " + engineVolume;*//* +
                ", productionYears = " + productionYears +
                ", productionCountry = " + productionCountry + ", color = " + color +
                ", maxSpeed = " + maxSpeed + '.'*//*
    }*/

   /* public abstract void refill();*/
}