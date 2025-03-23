import java.util.*;

public class SendingMessages {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long f = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long[] v = new long[(int) n + 1]; // 1-based indexing
        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextLong();
        }

        boolean ok = true;
        for (int i = 0; i < n; i++) {
            long x = Math.abs(v[i] - v[i + 1]) * a;
            long mn = Math.min(x, b);
            if (f > mn) {
                f -= mn;
            } else {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "YES" : "NO");
    }
}
