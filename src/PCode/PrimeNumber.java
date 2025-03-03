package PCode;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 13;
        boolean flag = false;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
