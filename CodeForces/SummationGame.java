import java.util.*;

public class SummationGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        int[] v = new int[n + 1];
        int[] pre = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }

        Arrays.sort(v, 1, n + 1); // Sort only from index 1 to n

        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + v[i];
        }

        int ans = Integer.MIN_VALUE;
        for (int i = n; i >= n - k; i--) {
            int r = Math.min(i, x);
            ans = Math.max(ans, 2 * pre[i - r] - pre[i]);
        }

        System.out.println(ans);
    }
}
