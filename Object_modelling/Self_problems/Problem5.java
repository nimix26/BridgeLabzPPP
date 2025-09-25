package Self problem;

import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department2 {
    String deptName;

    Department2(String deptName) {
        this.deptName = deptName;
    }

    void showDept() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String uniName;
    ArrayList<Department2> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String uniName) {
        this.uniName = uniName;
    }

    void addDepartment(Department2 d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showUniversity() {
        System.out.println("\nUniversity: " + uniName);
        for (Department2 d : departments) d.showDept();
        for (Faculty f : faculties) f.showFaculty();
    }
}

public class Problem5 {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        Department2 d1 = new Department2("Computer Science");
        Department2 d2 = new Department2("Physics");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();
    }
}

