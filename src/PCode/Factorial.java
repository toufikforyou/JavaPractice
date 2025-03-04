package PCode;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fact = 1;

        // for (int i = n; 0 < i; i--) {
        // fact = fact * i;
        // System.out.println(fact);
        // }

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println(fact);
        }

        System.out.println("Factorial of " + n + "! = is " + fact);

        sc.close();
    }

}
