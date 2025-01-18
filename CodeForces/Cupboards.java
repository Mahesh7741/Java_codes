import java.util.*;

public class Cupboards {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long lOpen = 0, lClose = 0;
        long rOpen = 0, rClose = 0;

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l == 1)
                lOpen++;
            else
                lClose++;

            if (r == 1)
                rOpen++;
            else
                rClose++;
        }

        System.out.println(Math.min(rClose, rOpen) + Math.min(lClose, lOpen));
    }

    public static void main(String[] args) {
        solve();
    }
}
