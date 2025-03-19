package lab02;

public class OddNumber {
    public static void main(String[] args) {
        int limit = 100;
        int i = 0;

        while (i <= limit) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
