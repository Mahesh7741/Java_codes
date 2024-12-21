import java.util.*;

public class TwoThreeMoves {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();

        if (n == 1) {
            System.out.println(2);
        } else if (n % 3 == 0) {
            System.out.println(n / 3);
        } else {
            System.out.println(n / 3 + 1);
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
