package DSA.String;

public class PatternSearching {
    // static void search(String pat, String txt)
    // {
    //     int l1 = pat.length();
    //     int l2 = txt.length();
    //     int i = 0, j = l2 - 1;
    //     for (i = 0, j = l2 - 1; j < l1;) {
    //         if (txt.equals(pat.substring(i, j + 1))) {
    //             System.out.println("Pattern found at index "+ i);
    //         }
    //         i++;
    //         j++;
    //     }
    // }   
    // public static void main(String args[])
    // {
    //     String pat = "AABAACAADAABAAABAA";
    //     String txt = "AABA";
    //     search(pat, txt);
    // }
    static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        
        for (int i = 0; i <= n - m; i++) {
            int j;
            // Check for pattern match starting at position i in the text
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            // If the inner loop ended without breaking and j reached m, pattern found
            if (j == m)
                System.out.println("Pattern found at index " + i);
        }
    }

    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";
        System.out.println("\nPattern search for text: \"" + text + "\" and pattern: \"" + pattern + "\"");
        search(text, pattern);
    }
}
