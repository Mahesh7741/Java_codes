import java.util.*;

public class TaisiaAndDice {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long s = sc.nextLong();
        long r = sc.nextLong();

        long currVal = s - r;
        System.out.print(currVal + " ");

        for (int i = 2; i <= n; i++) {
            while (r - currVal < n - i) {
                currVal--;
            }
            System.out.print(currVal + " ");
            r -= currVal;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
