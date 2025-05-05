package Arrays;

public class TransportMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 3, 2, 4 },
                { 2, 3, 4 }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print((arr[i][j] + arr[j][i]) + "\t");
            }
            System.out.println("\n");
        }
    }
}
