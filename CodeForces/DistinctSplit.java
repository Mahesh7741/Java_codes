import java.util.*;
public class DistinctSplit {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        String s = sc.next();

        int[] pref = new int[n];
        int[] suff = new int[n];
        HashSet<Character> hSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hSet.add(s.charAt(i));
            pref[i] = hSet.size();
        }
        hSet.clear();

        for (int i = n - 1; i >= 0; i--) {
            hSet.add(s.charAt(i));
            suff[i] = hSet.size();
        }

        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, pref[i] + suff[i + 1]);
        }
        System.out.println(ans);
    }
}
