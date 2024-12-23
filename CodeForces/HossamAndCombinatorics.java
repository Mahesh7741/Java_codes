import java.util.*;

public class HossamAndCombinatorics {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long mx = 0, cmx = 0, mn = (long) 1e6, cmn = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                if (x > mx) {
                    mx = x;
                    cmx = 1;
                } else if (x == mx) {
                    cmx++;
                }

                if (x < mn) {
                    mn = x;
                    cmn = 1;
                } else if (x == mn) {
                    cmn++;
                }
            }

            long ans = (mn < mx) ? (2 * cmn * cmx) : ((long) (n - 1) * n);
            System.out.println(ans);
        }
    }
}
