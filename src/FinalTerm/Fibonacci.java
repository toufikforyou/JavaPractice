package FinalTerm;

public class Fibonacci {

    public static int sumfibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return sumfibonacci(n - 1) + sumfibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int result = sumfibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
