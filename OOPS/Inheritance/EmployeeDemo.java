package BridgeLabzPPP.Inheritance;

// File: EmployeeDemo.java
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name; this.id = id; this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager, Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private int durationMonths;
    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern, Duration (months): " + durationMonths);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] emps = {
            new Manager("Asha", 101, 90000, 5),
            new Developer("Rohit", 102, 70000, "Java"),
            new Intern("Priya", 103, 10000, 6)
        };
        for (Employee e : emps) {
            e.displayDetails();
            System.out.println();
        }
    }
}

