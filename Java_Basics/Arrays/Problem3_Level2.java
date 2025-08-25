import java.util.Scanner;

class Problem3_Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] table = new int[10];

        for (int i = 0; i < table.length; i++) {
            table[i] = num * (i + 1);
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + table[i]);
        }

        sc.close();
    }
}
