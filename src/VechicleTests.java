public class VechicleTests
{
  public static void main(String[] args)
  {
    Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
    System.out.println(myTaxi3.getPassengers()); // should be 6, including driver

    // now let's drop off the 5 riders, charging 3.50 per rider
    boolean success = myTaxi3.chargeAndDropOffRiders(3.50);
    System.out.println(success); // should be true
    System.out.println(myTaxi3.getPassengers()); // should now be 1
    System.out.println(myTaxi3.getFareCollected()); // should be 17.50



  }
}
