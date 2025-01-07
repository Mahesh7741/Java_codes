import java.util.*;
public class RisingSand {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i + 1] + arr[i - 1]) {
                ans++;
            }
        }

        if (k == 1) {
            System.out.println((n - 1) / 2);
        } else {
            System.out.println(ans);
        }
    }
}
