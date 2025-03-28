import java.util.*;

public class MaximiseTheScore {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt(), k = sc.nextInt();
        Pair[] v = new Pair[n];

        for (int i = 0; i < n; i++) {
            v[i] = new Pair(sc.nextLong(), 0);
        }
        for (int i = 0; i < n; i++) {
            v[i].s = sc.nextLong();
        }

        Arrays.sort(v, Comparator.comparingLong(p -> p.f));
        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (v[i].s == 1) {
                long x = (i < n / 2) ? v[n / 2].f : v[(n - 2) / 2].f;
                ans = Math.max(ans, v[i].f + x + k);
            }
        }

        long l = 0, r = (long) 2e9;
        while (l < r) {
            long m = (l + r + 1) / 2, c = 0, q = k;
            for (int i = n - 2; i >= 0; i--) {
                if (v[i].f >= m) {
                    c++;
                } else if (v[i].s == 1 && v[i].f + q >= m) {
                    q -= m - v[i].f;
                    c++;
                }
            }

            if (c < (n + 1) / 2) {
                r = m - 1;
            } else {
                l = m;
            }
        }

        System.out.println(Math.max(ans, l + v[n - 1].f));
    }

    static class Pair {
        long f, s;
        Pair(long f, long s) {
            this.f = f;
            this.s = s;
        }
    }
}
