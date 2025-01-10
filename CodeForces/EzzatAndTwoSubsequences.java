import java.util.*;
import java.text.*;

public class EzzatAndTwoSubsequences {
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

        long sum = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        double result = (double)sum / (n - 1) + arr[n - 1];
        System.out.println(String.format("%.10f", result));
    }
}
