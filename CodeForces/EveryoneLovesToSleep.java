import java.util.*;
public class EveryoneLovesToSleep {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();
        long h = sc.nextLong();
        long m = sc.nextLong();

        long time = 60 * h + m;
        long ans = 24 * 60;

        for (int i = 0; i < n; i++) {
            long h1 = sc.nextLong();
            long m1 = sc.nextLong();

            long t = 60 * h1 + m1 - time;
            if (t < 0) {
                t += 24 * 60;
            }
            ans = Math.min(ans, t);
        }

        System.out.println(ans / 60 + " " + ans % 60);
    }
}
