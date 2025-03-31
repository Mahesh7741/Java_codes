import java.util.*;

public class YogurtSale {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (2 * a <= b) {
            System.out.println(n * a);
        } else {
            if (n % 2 == 1) {
                System.out.println((n / 2) * b + a);
            } else {
                System.out.println((n / 2) * b);
            }
        }
    }
}
