import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer een zin in: ");
        String sentence = scanner.nextLine().trim();

        int numChars = 0;
        int numWords = 0;
        int numVowels = 0;
        boolean isPalindrome = false;

        // Karakters tellen
        numChars = sentence.length();

        // Woorden tellen
        numWords = sentence.split(" ").length;

        // Medeklinker teller
        String vowels = "aeiouAEIOU";
        for (char c : sentence.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                numVowels += 1;
            }
        }

        // Karakter frequenties tellen
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        int max = Collections.max(charFrequency.values());

        // Palindrome check
        sentence = sentence.replaceAll("\\s", "");
        String reverse = new StringBuilder(sentence).reverse().toString();
        isPalindrome = sentence.equals(reverse);

        System.out.printf("Aantal karakters: %d\n", numChars);
        System.out.printf("Aantal woorden: %d\n", numWords);
        System.out.printf("Aantal vowels: %d\n", numVowels);
        System.out.printf("Palindrome: %b\n", isPalindrome);
    }
}
