package DSA.String;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int count = longestCommonSubsequence(s1, s2);
        System.out.println(count);
    }

    public static int longestCommonSubsequence(String s1, String s2) {
        return longestCommonSubsequenceHelper(s1, s2, s1.length(), s2.length());
    }

    private static int longestCommonSubsequenceHelper(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + longestCommonSubsequenceHelper(s1, s2, m - 1, n - 1);
        } else {
            return Math.max(longestCommonSubsequenceHelper(s1, s2, m, n - 1),
                            longestCommonSubsequenceHelper(s1, s2, m - 1, n));
        }
    }
}
