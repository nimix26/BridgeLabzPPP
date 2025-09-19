package BridgeLabzPPP.constructor;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void calculateCost() {
        int costPerDay = 1000;
        int total = rentalDays * costPerDay;
        System.out.println("Total Cost for " + customerName + ": " + total);
    }
}
