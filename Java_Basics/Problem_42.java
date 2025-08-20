import java.util.Scanner;

public class Problem_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (cm): ");
        double heightCm = input.nextDouble();
        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        System.out.print("BMI = " + bmi + " → Status: ");
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 24.9) System.out.println("Normal");
        else if (bmi < 29.9) System.out.println("Overweight");
        else System.out.println("Obese");

        input.close();
    }
}
