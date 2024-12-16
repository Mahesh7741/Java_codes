import java.util.*;
public class Promo {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long q = sc.nextLong();

        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }

        Collections.sort(arr);

        long[] preSum = new long[(int)n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + arr.get(i);
        }

        while (q-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            System.out.println(preSum[(int)(n - x + y)] - preSum[(int)(n - x)]);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
