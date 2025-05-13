package FinalTerm;

public class StringPermutations {

    public static void permute(char[] str, int l, int r) {
        if (l == r) {
            System.out.println(String.valueOf(str));
            return;
        }

        for (int i = l; i <= r; i++) {
            char temp = str[i];
            str[i] = str[l];
            str[l] = temp;

            permute(str, l + 1, r);

            temp = str[i];
            str[i] = str[l];
            str[l] = temp;
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("\nAll permutations of " + input + ":");
        permute(input.toCharArray(), 0, input.length() - 1);
    }
}
