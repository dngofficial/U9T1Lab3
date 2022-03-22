public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public void printTaxi() {
    System.out.println("License plate: " + getLicensePlate());
    System.out.println("Toll fee: " + getTollFee());
    System.out.println("Passengers: " + getPassengers());
    System.out.println("Electric? " + isElectric());
    System.out.println("Discount applied? " + isDiscountApplied());
    System.out.println("Total fare collected: " + fareCollected);
  }

  public boolean chargeAndDropOffRiders(double farePerRider)
  {
    int riders = getPassengers() - 1;
    setTollFee(getTollFee() + riders * farePerRider);
    fareCollected += riders * farePerRider;

    return dropOffPassengers(riders);
  }

  public double getFareCollected() {
    return fareCollected;
  }
}