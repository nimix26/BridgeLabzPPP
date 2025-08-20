import java.util.Scanner;

public class Problem_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (in inches): ");
        double baseIn = input.nextDouble();

        System.out.print("Enter height (in inches): ");
        double heightIn = input.nextDouble();

        double areaIn2 = 0.5 * baseIn * heightIn;
        double areaCm2 = areaIn2 * 2.54 * 2.54;

        System.out.println("The area of the triangle is " + areaIn2 + " square inches and " +
                           areaCm2 + " square centimeters");
        input.close();
    }
}
