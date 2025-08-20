import java.util.Scanner;

public class Problem_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double unitPrice;
        int quantity;

        System.out.print("Enter unit price (INR): ");
        unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total +
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        input.close();
    }
}
