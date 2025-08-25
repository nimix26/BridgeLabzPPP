import java.util.Scanner;

class Problem4_Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double sum = 0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0 || index == arr.length) {
                break;
            }

            arr[index] = num;
            index++;
        }

     
        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }

        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum = " + sum);

        sc.close();
    }
}

