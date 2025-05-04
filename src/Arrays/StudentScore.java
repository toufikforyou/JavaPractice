package Arrays;

public class StudentScore {
    public static void main(String[] args) {
        int[][] scores = {
                { 85, 90, 78, 92, 88 },
                { 76, 81, 74, 89, 90 },
                { 90, 93, 91, 95, 92 },
                { 60, 65, 70, 68, 72 },
                { 88, 84, 86, 90, 85 },
                { 72, 75, 70, 74, 76 },
                { 95, 98, 100, 97, 99 }
        };

        for (int i = 0; i < scores.length; i++) {
            int total = 0;

            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }

            System.out.println("Total score for Student " + (i + 1) + ": " + total);
        }
    }
}
