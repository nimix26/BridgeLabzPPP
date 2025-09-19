package BridgeLabzPPP.OOPS;


interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}


abstract class RideVehicle {
    private String vehicleId, driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName);
    }

    public abstract double calculateFare(double distance);
}

class RideCar extends RideVehicle implements GPS {
    private String location = "Unknown";

    public RideCar(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}


class RideBike extends RideVehicle implements GPS {
    private String location = "Unknown";

    public RideBike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}

// Auto
class RideAuto extends RideVehicle implements GPS {
    private String location = "Unknown";

    public RideAuto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}

// Main
public class Main8 {
    public static void main(String[] args) {
        RideVehicle v1 = new RideCar("C101", "Amit", 15);
        RideVehicle v2 = new RideBike("B201", "Rohit", 10);
        RideVehicle v3 = new RideAuto("A301", "Suresh", 12);

        v1.getVehicleDetails();
        System.out.println("Fare: " + v1.calculateFare(10));

        v2.getVehicleDetails();
        System.out.println("Fare: " + v2.calculateFare(10));

        v3.getVehicleDetails();
        System.out.println("Fare: " + v3.calculateFare(10));
    }
}
