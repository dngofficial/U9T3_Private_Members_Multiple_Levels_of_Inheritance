public class Taxi extends Car {

    private double totalFareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double totalFareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.totalFareCollected = totalFareCollected;
    }

    public void printTaxi() {
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passenger Count: " + getPassengers());
        System.out.println("Is electric: " + isElectric());
        System.out.println("Discount applied: " + isDiscountApplied());
        System.out.println("Total Fare Collected: " + totalFareCollected);
    }
}
