import java.util.*;
public class BinaryCafe {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();

        if (k < 40 && n >= (1L << k)) {
            System.out.println(1L << k);
            return;
        }
        System.out.println(n + 1);
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
