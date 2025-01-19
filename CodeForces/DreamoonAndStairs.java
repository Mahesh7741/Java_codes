import java.util.*;

public class DreamoonAndStairs {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long m = sc.nextLong();

        if (n == m) {
            System.out.println(n);
            return;
        }

        long ans = m;
        boolean hasAns = false;

        long low = (n % 2 == 0) ? (n / 2) : ((n + 1) / 2);
        long high = n;

        while (ans < n) {
            if (ans >= low && ans <= high) {
                hasAns = true;
                break;
            }
            ans += m;
        }

        System.out.println(hasAns ? ans : -1);
    }

    public static void main(String[] args) {
        solve();
    }
}
