package BridgeLabzPPP.Inheritance;

// File: CourseDemo.java
class Course {
    protected String courseName;
    protected int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName; this.duration = duration;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform; this.isRecorded = isRecorded;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes": "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // in percent

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee; this.discount = discount;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        double finalFee = fee * (1 - discount / 100.0);
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%, Final Fee: " + finalFee);
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse("Intro to ML", 40, "Udemy", true, 2000, 25);
        c.showDetails();
    }
}

