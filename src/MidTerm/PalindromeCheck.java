package MidTerm;

public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 121;
        int storeNumber = num;

        int r = 0;
        int last = 0;

        while (true) {
            last = num % 10;
            r = (r * 10) + last;
            num = num / 10;

            if (num == 0) {
                break;
            }
        }

        if (storeNumber == r) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
