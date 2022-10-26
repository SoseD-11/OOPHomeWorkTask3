package Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Trucks extends Transport implements Competing{


    public Trucks(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public double getBestLapTime() {
        return ThreadLocalRandom.current().nextDouble(1.00,9.99);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,200);
    }
    @Override
    public void startMoving() {
        System.out.println("Truck, " + getBrand() + " " + getModel() + ", start moving!");
    }

    @Override
    public void endMoving() {
        System.out.println("Truck, " + getBrand() + " " + getModel() + ", end moving!");
    }

    @Override
    public void pitStop() {
        System.out.println("Truck, " + getBrand() + " " + getModel() + ", went to the pit-stop!");
    }
  /* @Override
    public void circleIndicators() {
        System.out.println("Truck, " + getBrand() + " " + getModel() +
                ". Lap time - " + getBestLapTime() + ". Max speed - " + getMaxSpeed() + ".");
    }*/
  @Override
  public String toString() {
      return super.toString() + (". Lap time - " + getBestLapTime() + ". Max speed - " + getMaxSpeed() + ".");
  }
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
