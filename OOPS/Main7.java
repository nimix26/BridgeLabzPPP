package BridgeLabzPPP.OOPS;

// Interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract class
abstract class Patient {
    private int patientId, age;
    private String name;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

// InPatient
class InPatient extends Patient implements MedicalRecord {
    private double roomCharge = 2000;

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public double calculateBill() { return roomCharge * 5; }

    @Override
    public void addRecord(String record) { System.out.println("InPatient Record Added: " + record); }

    @Override
    public void viewRecords() { System.out.println("Viewing InPatient Records"); }
}

// OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee = 500;

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { System.out.println("OutPatient Record Added: " + record); }

    @Override
    public void viewRecords() { System.out.println("Viewing OutPatient Records"); }
}

// Main
public class Main7 {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Nimit", 25);
        Patient p2 = new OutPatient(2, "Ravi", 30);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
    }
}

