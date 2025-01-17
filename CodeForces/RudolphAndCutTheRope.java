import java.util.*;

public class RudolphAndCutTheRope {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long ans = 0;

        while (n-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a > b) ans++;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
