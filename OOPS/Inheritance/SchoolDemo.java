package BridgeLabzPPP.Inheritance;

// File: SchoolDemo.java
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) { this.name = name; this.age = age; }

    public void display() { System.out.println("Name: " + name + ", Age: " + age); }
}

class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age); this.subject = subject;
    }
    public void displayRole() {
        display();
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

class Student extends Person {
    private int grade;
    public Student(String name, int age, int grade) {
        super(name, age); this.grade = grade;
    }
    public void displayRole() {
        display();
        System.out.println("Role: Student, Grade: " + grade);
    }
}

class Staff extends Person {
    private String duty;
    public Staff(String name, int age, String duty) {
        super(name, age); this.duty = duty;
    }
    public void displayRole() {
        display();
        System.out.println("Role: Staff, Duty: " + duty);
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Ms. Mehta", 35, "Math");
        Student s = new Student("Aman", 14, 9);
        Staff st = new Staff("Rita", 28, "Reception");
        t.displayRole(); System.out.println();
        s.displayRole(); System.out.println();
        st.displayRole(); System.out.println();
    }
}

