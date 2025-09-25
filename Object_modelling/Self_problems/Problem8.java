package Self problem;
import java.util.*;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class Course2 {
    String courseName;
    Professor professor;

    Course2(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + courseName);
    }
}

class Student2 {
    String name;
    ArrayList<Course2> courses = new ArrayList<>();

    Student2(String name) {
        this.name = name;
    }

    void enrollCourse(Course2 c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.courseName);
    }
}

public class Problem8 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Ravi");
        Professor prof1 = new Professor("Dr. Sharma");

        Course2 c1 = new Course2("Java Programming");
        c1.assignProfessor(prof1);

        s1.enrollCourse(c1);
    }
}

