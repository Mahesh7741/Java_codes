

import java.util.HashSet;

public class CountDistinctSubsequences {
     public static void main(String arg[]) {
        String str = "abc";
        HashSet<String> subsequences = new HashSet<>();
        printAndCountDistinctSubsequences(str, 0, "", subsequences);
        System.out.println("Distinct Subsequences count: " + subsequences.size());
    }

    public static void printAndCountDistinctSubsequences(String str, int index, String current, HashSet<String> subsequences) {
        int n = str.length();
        // Base case: If index exceeds string length, print the current subsequence
        if (index == n) {
            subsequences.add(current);
            System.out.println(current);
            return;
        }
        // Case 1: Include current character
        printAndCountDistinctSubsequences(str, index + 1, current + str.charAt(index), subsequences);
        // Case 2: Exclude current character
        printAndCountDistinctSubsequences(str, index + 1, current, subsequences);
    }
}
