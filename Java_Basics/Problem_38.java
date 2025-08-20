import java.util.Scanner;

public class Problem_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        double physics = input.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3.0;
        char grade;
        String remarks;

        if (average >= 90) { grade = 'A'; remarks = "Excellent"; }
        else if (average >= 75) { grade = 'B'; remarks = "Very Good"; }
        else if (average >= 60) { grade = 'C'; remarks = "Good"; }
        else if (average >= 40) { grade = 'D'; remarks = "Pass"; }
        else { grade = 'F'; remarks = "Fail"; }

        System.out.println("Average Marks = " + average + "%, Grade = " + grade + " (" + remarks + ")");
        input.close();
    }
}
