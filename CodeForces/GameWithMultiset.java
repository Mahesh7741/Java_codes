import java.util.*;

public class GameWithMultiset {
    static Scanner in = new Scanner(System.in);
    static int testCases, n;
    static int a[];
    static long b[];

    static void solve() {
        int[] bit_count = new int[31];  // Count occurrences of each power of 2

        for (int i = 0; i < n; ++i) {
            if (a[i] == 1) {
                bit_count[(int) b[i]]++;
            } else {
                long need = b[i];
                boolean found = false;

                for (int bit = 30; bit >= 0; --bit) {
                    long bit_value = 1L << bit;  // Faster power of 2 computation
                    long required = need / bit_value;
                    long available = bit_count[bit];
                    long used = Math.min(required, available);
                    need -= used * bit_value;

                    if (need == 0) {
                        found = true;
                        break;
                    }
                }

                System.out.println(found ? "YES" : "NO");
            }
        }
    }

    public static void main(String[] args) {
        input();
        solve();
    }

    private static void input() {
        n = in.nextInt();
        a = new int[n];
        b = new long[n];

        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            b[i] = in.nextLong();
        }
    }
}
