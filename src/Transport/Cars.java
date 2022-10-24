package Transport;


import java.util.concurrent.ThreadLocalRandom;

public class Cars extends Transport implements Competing{

    public Cars(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
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
    public void pitStop() {
        System.out.println("Car, " + getBrand() + " " + getModel() + ", went to the pit-stop!");
    }
    @Override
    public void circleIndicators() {
        System.out.println("Car, " + getBrand() + " " + getModel() +
                        ". Lap time - " + getBestLapTime() + ". Max speed - " + getMaxSpeed() + ".");
    }

}

