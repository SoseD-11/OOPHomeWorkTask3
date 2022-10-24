package Transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;
   /* private final int productionYears;
    private final String productionCountry;
    private String color;
    private int maxSpeed;*/


    public Transport(String brand, String model, float engineVolume/*, int productionYears, String productionCountry, String color, int maxSpeed*/) {

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

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void circleIndicators();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }


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

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
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