package PCode;

public class SimpleCode {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; sum += i, i++)
            ;

        System.out.println(sum);
    }
}
