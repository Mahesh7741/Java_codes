import java.util.*;
public class MiddleClass {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong(), x = sc.nextLong();
        long[] v = new long[(int) n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        Arrays.sort(v);
        long have = 0;
        for (int i = (int) n - 1; i >= 0; i--) {
            long t = v[i];
            if (t >= x) {
                cnt++;
                have += (t - x);
            } else if (t + have >= x) {
                cnt++;
                have -= (x - t);
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        int testcase = sc.nextInt();
        for (int t = 1; t <= testcase; t++) {
            solve();
        }
    }
}
