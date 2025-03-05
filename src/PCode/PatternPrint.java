package PCode;

public class PatternPrint {

    public static void main(String[] args) {
        int row = 6;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2 * (row - i) - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}