package BridgeLabzPPP.Inheritance;

// File: SmartHomeDemo.java
class Device {
    protected String deviceId;
    protected boolean status; // true = ON, false = OFF

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId; this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + (status ? "ON": "OFF"));
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + " °C");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T-001", true, 24.5);
        t.displayStatus();
    }
}

