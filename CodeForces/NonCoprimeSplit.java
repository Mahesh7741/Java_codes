import java.util.*;

public class NonCoprimeSplit {
    static Scanner sc = new Scanner(System.in);
    static final int N = 10000005;
    static int[] divisors = new int[N];

    public static void main(String[] args) {
        Arrays.fill(divisors, -1);
        sieve();
        int t = sc.nextInt();
        while (t-- > 0) solve();
    }

    static void sieve() {
        for (int i = 2; i * i < N; i++) {
            if (divisors[i] == -1) {
                for (int j = i * i; j < N; j += i) {
                    divisors[j] = i;
                }
            }
        }
    }

    static void solve() {
        int l = sc.nextInt();
        int r = sc.nextInt();

        if (r <= 3) {
            System.out.println(-1);
            return;
        }
        if (l % 2 == 0 && l != 2) {
            System.out.println((l / 2) + " " + (l / 2));
            return;
        }
        if (r % 2 == 0 && r != 2) {
            System.out.println((r / 2) + " " + (r / 2));
            return;
        }
        if (l != r) {
            System.out.println(2 + " " + (r - 3));
            return;
        }
        if (divisors[l] != -1) {
            System.out.println(divisors[l] + " " + (l - divisors[l]));
        } else {
            System.out.println(-1);
        }
    }
}
