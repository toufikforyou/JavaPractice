package PCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text to count letters: ");
        String text = scanner.nextLine();

        Map<Character, Integer> letterCounts = countLetters(text);
        displayLetterCounts(letterCounts);

        scanner.close();
    }

    public static Map<Character, Integer> countLetters(String text) {
        Map<Character, Integer> counts = new HashMap<>();

        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        }

        return counts;
    }

    public static void displayLetterCounts(Map<Character, Integer> counts) {
        System.out.println("\nLetter counts:");
        counts.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}