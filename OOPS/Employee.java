package BridgeLabzPPP.OOPS;

public class Employee {
    static String companyName = "Tech Pvt Ltd";
    static int totalEmployees = 0;

    final int id;
    String name, designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nimit", "Developer");
        Employee e2 = new Employee(2, "Ravi", "Manager");

        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
