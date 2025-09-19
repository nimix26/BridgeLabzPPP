package BridgeLabzPPP.OOPS;

public class Student {
    static String universityName = "Delhi University";
    static int totalStudents = 0;

    final int rollNumber;
    String name, grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Nimit", "A");
        Student s2 = new Student(102, "Rohit", "B");

        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
    
}
