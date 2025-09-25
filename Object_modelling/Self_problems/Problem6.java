package Self problem;

import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting Patient " + p.name);
    }
}

class Hospital {
    String name;

    Hospital(String name) {
        this.name = name;
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Amit");
        Patient p1 = new Patient("Ravi");

        d1.consult(p1);
    }
}

