package PCode;

public class OddNumberPrint {
    public static void main(String[] args) {
        int limit = 100;

        System.out.println("Odd number list up to " + limit);
        for (int i = 0; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}