package BridgeLabzPPP.Inheritance;

// File: HybridVehicleDemo.java
interface Refuelable {
    void refuel();
}

class Vehicle {
    protected String model;
    protected int maxSpeed;
    public Vehicle(String model, int maxSpeed) { this.model = model; this.maxSpeed = maxSpeed; }
    public void info() { System.out.println("Model: " + model + ", MaxSpeed: " + maxSpeed); }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) { super(model, maxSpeed); }
    public void charge() { System.out.println(model + " is charging."); }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) { super(model, maxSpeed); }
    @Override
    public void refuel() { System.out.println(model + " is refueling with petrol."); }
}

public class HybridVehicleDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("E-Car", 160);
        PetrolVehicle pv = new PetrolVehicle("P-Car", 180);
        ev.info(); ev.charge();
        pv.info(); pv.refuel();
    }
}

