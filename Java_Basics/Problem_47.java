import java.util.Scanner;

public class Problem_47 {
    public static void main(String[] args) {
        int m, d, y;

        if (args.length < 3) {
            // Fallback to Scanner if no command-line args
            Scanner input = new Scanner(System.in);
            System.out.print("Enter month (1-12): ");
            m = input.nextInt();
            System.out.print("Enter day: ");
            d = input.nextInt();
            System.out.print("Enter year: ");
            y = input.nextInt();
            input.close();
        } else {
            // Take values from command-line arguments
            m = Integer.parseInt(args[0]);
            d = Integer.parseInt(args[1]);
            y = Integer.parseInt(args[2]);
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        System.out.println("Day of week = " + d0);
        // 0=Sunday, 1=Monday, ..., 6=Saturday
    }
}
