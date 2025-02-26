import java.util.*;

public class LongestDivisorsInterval {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long cnt = 1;
        for (long p = 2; p <= n && n % p == 0; p++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
