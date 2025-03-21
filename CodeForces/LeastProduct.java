import java.util.*;

public class LeastProduct {
    static final long M = 1000000007;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        long prod = 1;

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            prod = (prod * x) % M;
        }

        if (prod > 0) {
            System.out.println(1);
            System.out.println("1 0");
        } else {
            System.out.println(0);
        }
    }
}
