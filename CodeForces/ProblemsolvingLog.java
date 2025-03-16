import java.util.*;

public class ProblemsolvingLog {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        int[] cnt = new int[26];

        for (int i = 0; i < n; ++i) {
            cnt[s.charAt(i) - 'A']++;
        }

        int ct = 0;
        for (int i = 0; i < 26; ++i) {
            if (cnt[i] >= i + 1) {
                ct++;
            }
        }
        System.out.println(ct);
    }
}
