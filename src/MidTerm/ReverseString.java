package MidTerm;

public class ReverseString {

    public static void main(String[] args) {
        String string = "ASDF";

        StringBuilder sBuilder = new StringBuilder(string);

        System.out.println(sBuilder.reverse().toString());
    }

}
