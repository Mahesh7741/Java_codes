import java.util.*;

public class LongInversions {
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
        int ans = 1;
        int[] flip = new int[n];

        for (int k = 2; k <= n; ++k) {
            Arrays.fill(flip, 0);
            int f = 0;

            for (int i = 0; i <= n - k; ++i) {
                if ((f + (s.charAt(i) - '0')) % 2 == 0) {
                    f ^= 1;
                    flip[i + k - 1] = 1;
                }
                f ^= flip[i];
            }

            boolean ok = true;
            for (int i = n - k + 1; i < n; ++i) {
                ok &= ((f + (s.charAt(i) - '0')) & 1) == 1;
                f ^= flip[i];
            }

            if (ok) ans = k;
        }

        System.out.println(ans);
    }
}
