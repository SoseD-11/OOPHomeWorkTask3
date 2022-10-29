package Transport;


import java.util.concurrent.ThreadLocalRandom;

public class Cars extends Transport implements Competing{

private BodyType bodyType;
    public Cars(String brand, String model, float engineVolume,BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public double getBestLapTime() {
        return ThreadLocalRandom.current().nextDouble(1.01,9.99);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,500);
    }
    @Override
    public void startMoving() {
        System.out.println("Car, " + getBrand() + " " + getModel() + ", start moving!");
    }

    @Override
    public void endMoving() {
        System.out.println("Car, " + getBrand() + " " + getModel() + ", end moving!");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Car data is not enough");
        }else{
            System.out.println("Car body type " + bodyType);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Car, " + getBrand() + " " + getModel() + ", went to the pit-stop!");
    }

    @Override
    public String toString() {
        return super.toString() +  (". Lap time - " + getBestLapTime() + ". Max speed - " + getMaxSpeed() + ".");
    }

    /* @Override
    public void  circleIndicators() {
        System.out.println("Car, " + getBrand() + " " + getModel() +
                ". Lap time - " + getBestLapTime() + ". Max speed - " + getMaxSpeed() + ".");
    }*/
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }





}

