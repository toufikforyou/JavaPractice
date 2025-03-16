package MidTerm;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 123456;
        int last = 0;
        int reverse = 0;

        while (true) {
            last = num % 10;
            reverse = (reverse * 10) + last;
            num = num / 10;

            if (num == 0) {
                break;
            }
        }

        System.out.println(reverse);
    }

}
