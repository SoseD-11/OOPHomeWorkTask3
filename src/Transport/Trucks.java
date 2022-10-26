package Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Trucks extends Transport implements Competing{

private Weights weights;
    public Trucks(String brand, String model, float engineVolume,Weights weights) {
        super(brand, model, engineVolume);
        this.weights = weights;
    }

    public Weights getWeights() {
        return weights;
    }

    public void setWeights(Weights weights) {
        this.weights = weights;
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
    public void printType() {
        if (weights == null) {
            System.out.println("Car data is not enough");
        }else{
            String from = weights.getFrom()==null?"":"from "+ weights.getFrom() + "t.";
            String to = weights.getTo()==null?"":"to "+ weights.getTo() + "t.";
            System.out.println("Truck capacity " + from + to);
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
