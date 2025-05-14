package FinalTerm;

public class StringPermutations {

    public static void swap(char[] str, int l, int r) {
        char temp = str[l];
        str[l] = str[r];
        str[r] = temp;
    }

    public static void permute(char[] str, int l, int r) {
        if (l == r) {
            System.out.println(String.valueOf(str));
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(str, i, l);

            permute(str, l + 1, r);

            swap(str, i, l);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("\nAll permutations of " + input + ":");
        permute(input.toCharArray(), 0, input.length() - 1);
    }
}
