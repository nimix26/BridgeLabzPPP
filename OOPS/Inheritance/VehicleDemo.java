package BridgeLabzPPP.Inheritance;

// File: VehicleDemo.java
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed; this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private double loadCapacityTons;
    public Truck(int maxSpeed, String fuelType, double loadCapacityTons) {
        super(maxSpeed, fuelType);
        this.loadCapacityTons = loadCapacityTons;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Load Cap: " + loadCapacityTons + " tons");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasCarrier;
    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 10.5),
            new Motorcycle(140, "Petrol", false)
        };
        for (Vehicle v : fleet) {
            v.displayInfo();
            System.out.println();
        }
    }
}

