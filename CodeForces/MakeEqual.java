import java.util.*;

public class MakeEqual {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        long[] v = new long[n];
        long net = 0;

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
            net += v[i];
        }

        long x = net / n, r = 0;
        for (int i = 0; i < n; i++) {
            if (r + v[i] < x) {
                System.out.println("NO");
                return;
            }
            r = v[i] + r - x;
        }

        System.out.println("YES");
    }
}
