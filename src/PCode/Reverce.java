package PCode;

public class Reverce {
    public static void main(String[] args) {
        int n = 123;

        System.out.println(reverceInt(n));
        System.out.println(reverceString("asdfasdf"));
    }

    public static int reverceInt(int number) {
        int r = 0;
        int last = 0;

        while (true) {
            last = number % 10; // 3
            r = (r * 10) + last; // 3
            number = number / 10; // 12

            if (number == 0) {
                break;
            }
        }

        return r;
    }

    public static String reverceString(String string) {
        String n = string;
        int length = n.length();

        String result = "";

        for (int i = length; i > 0; i--) {
            result += n.charAt(i - 1);
        }

        return result;
    }
}
