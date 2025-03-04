package lab01;

import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secound = scanner.nextInt();

        timeConvert(secound);

        scanner.close();
    }

    public static void timeConvert(int time) {
        int hour = time / 60;
        int minute = time % 60;

        System.out.println(time + " minutes is " + hour + " hours and " + minute + " minutes.");
    }
}
