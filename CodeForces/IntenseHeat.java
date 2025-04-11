import java.util.*;

public class IntenseHeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        double ans = 0.0;

        for (int len = k; len <= n; len++) {
            double sum = 0.0;

            // Initial window of length len
            for (int i = 0; i < len; i++) {
                sum += a[i];
            }

            ans = Math.max(ans, sum / len);

            // Sliding window
            for (int i = 1; i + len - 1 < n; i++) {
                sum -= a[i - 1];
                sum += a[i + len - 1];
                ans = Math.max(ans, sum / len);
            }
        }

        System.out.printf("%.7f\n", ans);
    }
}
