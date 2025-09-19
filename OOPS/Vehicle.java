package BridgeLabzPPP.OOPS;

class Vehicle {
    static double registrationFee = 5000;

    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration No: " + registrationNumber);
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("DL01AB1234", "Nimit", "Car");
        v1.displayDetails();
        Vehicle.updateRegistrationFee(6000);
        v1.displayDetails();
    }
}

