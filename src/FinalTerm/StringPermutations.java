package FinalTerm;

public class StringPermutations {
    public static int count = 0;

    public static void permute(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(count++ + ": " + prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                char ch = remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                permute(prefix + ch, newRemaining);
            }
        }
    }

    public static void main(String[] args) {
        String input = "123";
        System.out.println("\nAll permutations of " + input + ":");
        permute("", input);
    }
}
