package PCode;

public class PatternPrint {

    public static void main(String[] args) {
        int row = 6;
        StarPrint(row);
        NumberPrint(row);
        AllNumberPrint(row);
    }

    public static void StarPrint(int row) {
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

    public static void NumberPrint(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2 * (row - i) - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void AllNumberPrint(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2 * (row - i) - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}