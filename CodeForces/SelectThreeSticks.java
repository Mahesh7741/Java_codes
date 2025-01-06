import java.util.*;
public class SelectThreeSticks {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();
        long[] sticks = new long[(int) n];

        for (int i = 0; i < n; i++) {
            sticks[i] = sc.nextLong();
        }

        Arrays.sort(sticks);

        long minSticks = Long.MAX_VALUE;

        for (int i = 0; i <= n - 3; i++) {
            long currDiff = sticks[i + 2] - sticks[i];
            minSticks = Math.min(minSticks, currDiff);
        }

        System.out.println(minSticks);
    }
}
