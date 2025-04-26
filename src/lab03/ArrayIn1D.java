package lab03;

import java.util.Scanner;

public class ArrayIn1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int temp;

        System.out.println("Enter your elements step by step: \n");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element number " + (i + 1) + " is: ");
            arr[i] = scanner.nextInt();
        }

        // Swap the 2nd element with the 4th element.
        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        // Swap the 6th element with the 8th element.
        temp = arr[5];
        arr[5] = arr[7];
        arr[7] = temp;

        // Find and print: The total sum of all even numbers in the array.
        int sum = 0;
        int count = 0;
        int maxEven = 0;
        System.out.println("Find and print result: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];

                if (arr[i] > maxEven)
                    maxEven = arr[i];

                if (count > 0)
                    System.out.print(" + " + arr[i]);
                else
                    System.out.print(arr[i]);

                count++;
            }
        }

        if (count == 0) {
            System.out.println("\nNo even numbers in the array.");
        } else {
            System.out.print(" = " + sum);
            System.out.println("\n\nMaximum even number: " + maxEven);
            if (sum % count == 0) {
                System.out.println("The sum is divisible by the count of even numbers.");
            } else {
                System.out.println("The sum is NOT divisible by the count of even numbers.");
            }
        }
        scanner.close();
    }
}
