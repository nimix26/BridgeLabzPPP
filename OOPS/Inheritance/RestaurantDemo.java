package BridgeLabzPPP.Inheritance;

// File: RestaurantDemo.java
interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;
    public Person(String name, int id) { this.name = name; this.id = id; }
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) { super(name, id); }
    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " prepares meals.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) { super(name, id); }
    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " serves customers.");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Worker[] workers = { new Chef("Karan", 201), new Waiter("Simran", 202) };
        for (Worker w : workers) {
            w.performDuties();
        }
    }
}

