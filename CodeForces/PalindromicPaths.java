import java.util.*;

public class PalindromicPaths {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long[][] ma = new long[(int)(m * n)][2];

        for (int i = 0; i < m * n; i++) {
            ma[i][0] = 0;
            ma[i][1] = 0;
        }

        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= m; j++) {
                long x = sc.nextLong();
                if (x == 1) {
                    ma[(int)(j - 1 + i - 1)][1] += 1;
                    ma[(int)(m - j + n - i)][1] += 1;
                } else {
                    ma[(int)(j - 1 + i - 1)][0] += 1;
                    ma[(int)(m - j + n - i)][0] += 1;
                }
            }
        }

        long ans = 0;
        long x = (m * n) / 2;

        for (int i = 0; i < m * n; i++) {
            if ((m + n - 2) % 2 == 1 || i != (m + n - 2) / 2) {
                ans += Math.min(ma[i][0], ma[i][1]);
            }
        }

        System.out.println(ans / 2);
    }
}
