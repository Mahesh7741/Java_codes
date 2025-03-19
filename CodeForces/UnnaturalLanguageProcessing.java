import java.util.*;

public class UnnaturalLanguageProcessing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e';
    }

    static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder ans = new StringBuilder();

        for (int i = n - 1; i >= 0; --i) {
            if (i > 0 && isVowel(s.charAt(i)) && !isVowel(s.charAt(i - 1))) {
                ans.append(s.charAt(i));
                ans.append(s.charAt(i - 1));
                ans.append('.');
                --i;
            } else {
                ans.append(s.charAt(i));
            }
        }

        if (ans.length() > 0 && ans.charAt(ans.length() - 1) == '.') {
            ans.setLength(ans.length() - 1);
        }

        System.out.println(ans.reverse().toString());
    }
}
