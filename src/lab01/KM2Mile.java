package lab01;

import java.util.Scanner;

public class KM2Mile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = scanner.nextDouble();

        double mile = km2mile(km);

        System.out.println(km + " km is " + mile + " miles.");

        scanner.close();
    }

    public static double km2mile(double km) {
        return km / 1.609;
    }
}
