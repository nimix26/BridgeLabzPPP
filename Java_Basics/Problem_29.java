import java.util.Scanner;

public class Problem_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, height;
        System.out.print("Enter base in cm: ");
        base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The area of the triangle in sq in is " + areaIn2 +
                           " and in sq cm is " + areaCm2);
        input.close();
    }
}
