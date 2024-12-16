import java.util.*;
public class BANBAN {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();

        System.out.println(n / 2 + n % 2);

        long i = 1, j = 3 * n;

        while (i < j) {
            System.out.println(i + " " + j);
            i += 3;
            j -= 3;
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
