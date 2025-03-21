import java.util.*;

public class EraseFirstOrSecondLetter {
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
        boolean[] found = new boolean[26];
        long ans = 0;

        for (int i = 0; i < n; ++i) {
            if (!found[s.charAt(i) - 'a']) {
                found[s.charAt(i) - 'a'] = true;
                ans += (n - i);
            }
        }
        System.out.println(ans);
    }
}
