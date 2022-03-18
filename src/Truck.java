public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;

  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck() {
    System.out.println("License Plate: " + getLicensePlate());
    System.out.println("Toll Fee: " + getTollFee());
    System.out.println("Passenger Count: " + getPassengers());
    System.out.println("Axle Count: " + axles);
    System.out.println("Has Trailer: " + hasTrailer);
  }

  public boolean validateLicensePlate() {
    if (hasTrailer == true) {
      String lastLetters = getLicensePlate().substring(getLicensePlate().length() - 2);
      return (lastLetters.equals("MX") && axles > 4 || lastLetters.equals("LX") && axles <= 4);
    } else {

      return true;
    }

  }
}