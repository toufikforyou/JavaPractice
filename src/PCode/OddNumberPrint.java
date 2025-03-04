package PCode;

import java.util.Scanner;

public class OddNumberPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your limit of the odd number: ");
        int limit = scanner.nextInt();

        System.out.println("Odd number list up to " + limit);

        for (int i = 0; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}