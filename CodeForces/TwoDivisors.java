import java.util.*;

public class TwoDivisors {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = lcm(a, b);

        if (ans != b)
            System.out.println(ans);
        else
            System.out.println(b * (b / a));
    }
}
