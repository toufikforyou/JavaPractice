package lab01;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and the power you want to raise it to: ");
        int num = scanner.nextInt();
        System.out.println("Enter the power: ");
        int power = scanner.nextInt();

        double result = addPower(num, power);
        System.out.println(num + " to the power of " + power + " is " + result);
    }

    public static int addPower(int num, int power) {
        return (int) Math.pow(num, power);
    }
}