import java.util.*;

public class MaximumSum {
    public static void solve(Scanner sc) {
        int n = sc.nextInt(), k = sc.nextInt();
        long[] v = new long[n], pre = new long[n + 1];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        Arrays.sort(v);
        pre[0] = 0;
        for (int i = 1; i <= n; i++) {
            pre[i] = v[i - 1] + pre[i - 1];
        }

        long mx = 0;
        for (int i = 0; i <= k; i++) {
            mx = Math.max(mx, pre[n - i] - pre[2 * (k - i)]);
        }

        System.out.println(mx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
