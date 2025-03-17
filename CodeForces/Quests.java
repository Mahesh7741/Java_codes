import java.util.*;

public class Quests {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            long ans = 0, maxB = b[0], sum = 0;

            for (int i = 0; i < n && i < k; i++) {
                maxB = Math.max(maxB, b[i]);
                sum += a[i];
                ans = Math.max(ans, sum + maxB * (k - i - 1));
            }

            System.out.println(ans);
        }
    }
}
