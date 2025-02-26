package PCode;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many random numbers do you want to sum? ");
        int count = scanner.nextInt();

        System.out.println("Enter the maximum value for random numbers: ");
        int maxValue = scanner.nextInt();

        int sum = calculateRandomSum(count, maxValue);
        System.out.println("The sum of " + count + " random numbers is: " + sum);

        scanner.close();
    }

    public static int calculateRandomSum(int count, int maxValue) {
        Random random = new Random();
        int sum = 0;

        System.out.println("Generated random numbers:");
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(maxValue + 1); // generates number between 0 and maxValue
            System.out.print(randomNumber + " ");
            sum += randomNumber;
        }
        System.out.println(); // new line after printing numbers

        return sum;
    }
}