import java.util.Scanner;

public class Problem_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        long n = input.nextLong();

        long handshakes = n * (n - 1) / 2;

        System.out.println("The maximum number of possible handshakes is " + handshakes);
        input.close();
    }
}
