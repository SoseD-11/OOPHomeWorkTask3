package Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Buses extends Transport implements Competing{
private Capacity capacity;

    public Buses(String brand, String model, float engineVolume,Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public double getBestLapTime() {
        return ThreadLocalRandom.current().nextDouble(1.00,9.99);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,150);
    }
    @Override
    public void startMoving() {
        System.out.println("Bus, " + getBrand() + " " + getModel() + ", start moving!");
    }

    @Override
    public void endMoving() {
        System.out.println("Bus, " + getBrand() + " " + getModel() + ", end moving!");
    }

    @Override
    public void pitStop() {
        System.out.println("Bus, " + getBrand() + " " + getModel() + ", went to the pit-stop!");
    }
   /* @Override
    public void circleIndicators() {
        System.out.println("Bus, " + getBrand() + " " + getModel() +
                ". Lap time - " + getBestLapTime() + ". Max speed - " + getMaxSpeed() + ".");
    }*/
   @Override
   public void printType() {
       if (capacity == null) {
           System.out.println("Car data is not enough");
       }else{
           System.out.println("Bus capacity from " + capacity.getFrom() + " places, to" + capacity.getTo() + " places");
       }
   }
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
