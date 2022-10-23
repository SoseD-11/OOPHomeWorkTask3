package Transport;

public abstract class Transport {

    private String brand;
    private String model;
    private final int productionYears;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    // КОНСТРУКТОР
    public Transport(String brand, String model, int productionYears, String productionCountry, String color, int maxSpeed) {

        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null ||  model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYears <= 0) {
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
    }

    public abstract void refill();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYears() {
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

    }


    public String toString() {
        return "Transport " + "brand = " + brand + ", model = " + model +
                ", productionYears = " + productionYears +
                ", productionCountry = " + productionCountry + ", color = " + color +
                ", maxSpeed = " + maxSpeed + '.';
    }
}