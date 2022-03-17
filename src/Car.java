public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;

  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public void printCar() {
    System.out.println("License Plate: " + getLicensePlate());
    System.out.println("Toll Fee: " + getTollFee());
    System.out.println("Passenger Count: " + getPassengers());
    System.out.println("Is electric: " + electric);
    System.out.println("Discount applied: " + discountApplied);
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut) {
    int currentPassenger = getPassengers();

    if (numOut >= currentPassenger) {
      return false;
    } else {
      setPassengers(currentPassenger - numOut);
      return true;
    }
  }

  public void applyDiscount()
  {
    if(discountApplied == false && isElectric())
    {
    setTollFee(getTollFee() - (getTollFee()/2 ));
    discountApplied = true;
    }
  }

}
