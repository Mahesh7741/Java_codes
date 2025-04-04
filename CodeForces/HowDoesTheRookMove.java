import java.util.*;

public class HowDoesTheRookMove {
    static final int N = 300010;
    static final int M = (int) 1e9 + 7;
    static int[] dp = new int[N];
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

        Arrays.fill(dp, -1);

        int used = 0;
        for (int i = 0; i < k; ++i) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            used += 2 - (r == c ? 1 : 0);
        }

        int m = n - used;
        int ans = func(m);
        System.out.println(ans);
    }

    static int func(int n) {
        if (n == 0 || n == 1) return 1;
        if (dp[n] != -1) return dp[n];
        long val = (func(n - 1) + (2L * (n - 1) * func(n - 2)) % M) % M;
        return dp[n] = (int) val;
    }
}
