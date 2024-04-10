

public class CountDistinctOccurrencesWithOtherSreing {
    public static int countDistinctOccurrences(String S, String T) {
        return countDistinctOccurrencesHelper(S, T, 0, 0);
    }

    private static int countDistinctOccurrencesHelper(String S, String T, int sIndex, int tIndex) {
        if (tIndex == T.length()) {
            return 1; // T found as subsequence
        }

        if (sIndex == S.length()) {
            return 0; // Reached end of S but T not found as subsequence
        }

        int count = 0;

        // If the current characters match, recursively move to the next character in both strings
        if (S.charAt(sIndex) == T.charAt(tIndex)) {
            count += countDistinctOccurrencesHelper(S, T, sIndex + 1, tIndex + 1);
        }

        // Move to the next character in S
        count += countDistinctOccurrencesHelper(S, T, sIndex + 1, tIndex);

        return count;
    }

    public static void main(String[] args) {
        String S1 = "banana";
        String T1 = "ban";
        System.out.println(countDistinctOccurrences(S1, T1)); // Output: 3

        String S2 = "geeksforgeeks";
        String T2 = "ge";
        System.out.println(countDistinctOccurrences(S2, T2)); // Output: 6
    }
}
