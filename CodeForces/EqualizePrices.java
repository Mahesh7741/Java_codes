import java.util.Arrays;
import java.util.Scanner;

public class EqualizePrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] a = new long[(int) n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);
            long tk = a[0] + k;

            if (Math.abs(tk - a[0]) <= k && Math.abs(tk - a[(int)(n - 1)]) <= k) {
                System.out.println(tk);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
