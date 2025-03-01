import java.util.*;
public class IncreasingAndDecreasing {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            int n = sc.nextInt();
            long[] v = new long[n];
            v[n - 1] = y;
            v[0] = x;
            long cnt = 1;

            for (int i = n - 2; i >= 1; i--) {
                v[i] = v[i + 1] - cnt;
                cnt++;
            }

            if ((v[1] - v[0]) > (v[2] - v[1])) {
                for (long value : v) {
                    System.out.print(value + " ");
                }
            } else {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
