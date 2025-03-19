package lab02;

public class StringReverse {
    public static void main(String[] args) {
        String original = "Hello World Text By MH TOUFIK";
        System.out.println("Original: " + original);

        StringBuilder stringBuilder = new StringBuilder(original);

        System.out.println("Reverse: " + stringBuilder.reverse());
    }

}
