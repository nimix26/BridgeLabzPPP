import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void showEmployee() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("\nCompany: " + name);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Company comp = new Company("Tech Corp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Aman"));
        d1.addEmployee(new Employee("Riya"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Priya"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();
    }
}

