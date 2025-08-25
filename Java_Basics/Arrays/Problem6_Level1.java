package Arrays;

import java.util.Scanner;

public class Problem6_Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("Mean Height of the football team = " + mean);

        input.close();
    }
}
