import java.util.*;

public class PlusOneOnTheSubset {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long MAX = Long.MIN_VALUE;
        long MIN = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            MIN = Math.min(MIN, arr[i]);
            MAX = Math.max(MAX, arr[i]);
        }

        System.out.println(MAX - MIN);
    }
}
