import java.util.Scanner;

public class ExtraCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        String s = sc.nextLine();

        // Input dictionary length and dictionary words
        int dictionaryLen = sc.nextInt();
        sc.nextLine();  // Consume the remaining newline after nextInt()

        String[] dictionary = new String[dictionaryLen];
        for (int i = 0; i < dictionaryLen; i++) {
            dictionary[i] = sc.nextLine();
        }

        // Frequency array to track character counts in dictionary words
        int[] dictionaryAlphabets = new int[26];

        // Constructing a combined string from dictionary words
        for (String word : dictionary) {
            for (char ch : word.toCharArray()) {
                dictionaryAlphabets[ch - 'a']++;
            }
        }

        // Frequency array to track character counts in the input string
        int[] inputAlphabets = new int[26];
        for (char ch : s.toCharArray()) {
            inputAlphabets[ch - 'a']++;
        }

        // Count the extra characters in the input string that are not part of the dictionary words
        int extraCharCount = 0;
        for (int i = 0; i < 26; i++) {
            if (inputAlphabets[i] > dictionaryAlphabets[i]) {
                extraCharCount += (inputAlphabets[i] - dictionaryAlphabets[i]);
            }
        }

        // Output the number of extra characters
        System.out.println(extraCharCount);
    }
}
