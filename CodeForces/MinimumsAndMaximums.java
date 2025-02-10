import java.util.*;
public class MinimumsAndMaximums {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int l1 = sc.nextInt(), r1 = sc.nextInt();
        int l2 = sc.nextInt(), r2 = sc.nextInt();
        int ans = 0;

        for (int i = l1; i <= r1; i++) {
            if (i >= l2 && i <= r2) {
                ans = i;
                break;
            }
        }

        System.out.println(ans != 0 ? ans : l1 + l2);
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        while (TCS-- > 0) solve();
    }
}
