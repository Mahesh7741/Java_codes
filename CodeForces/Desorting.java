import java.util.*;

public class Desorting {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();

        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long minDiff = Long.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(0);
                return;
            } else {
                minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
            }
        }

        System.out.println(minDiff / 2 + 1);
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
