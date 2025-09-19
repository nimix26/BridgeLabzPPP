package BridgeLabzPPP.OOPS;

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class
abstract class Vehicle {
    private String vehicleNumber, type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

// Car
class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 2000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: 2000";
    }
}

// Bike
class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: 500";
    }
}

// Truck
class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 3000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: 3000";
    }
}

// Main
public class Main3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", 1000);
        Vehicle v2 = new Bike("B201", 300);
        Vehicle v3 = new Truck("T301", 2000);

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            System.out.println("Rental Cost: " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
            }
        }
    }
}

