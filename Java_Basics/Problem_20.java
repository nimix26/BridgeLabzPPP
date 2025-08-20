import java.util.Scanner;

public class Problem_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        double inchesTotal = heightCm / 2.54;
        int feet = (int)(inchesTotal / 12);
        double inches = inchesTotal - (feet * 12);

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }
}
