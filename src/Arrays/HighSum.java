package Arrays;

public class HighSum {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 5, 7, 2, 5 },
                { 7, 7, 3, 5, 1 },
                { 9, 5, 3, 7, 7 },
                { 6, 4, 5, 8, 9 }
        };

        int sum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int innerSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                innerSum += array[i][j];
            }

            if (sum < innerSum) {
                sum = innerSum;
                index = i;
            }
        }

        System.out.println("Hight sum is: " + sum + " an index" + index);
    }
}