package lab01;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        double rate = 5;
        double time = 3;

        double interest = calculateInterest(principal, rate, time);
        System.out.println("The principal amount is " + principal + "and interest rate is " + rate
                + "% and the interest is " + interest);

        scanner.close();
    }

    public static double calculateInterest(double principal, double rate, double time) {
        return principal * (rate / 100) * time;
    }
}
