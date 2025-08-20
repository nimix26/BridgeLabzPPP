import java.util.Scanner;

public class Problem_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits in " + number + " = " + count);
        input.close();
    }
}
