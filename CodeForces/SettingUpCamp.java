import java.util.*;

public class SettingUpCamp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = a;

        ans += b / 3;
        b %= 3;

        if (b > 0 && c < 3 - b) {
            System.out.println(-1);
            return;
        }

        if (b > 0) {
            ans++;
            c -= (3 - b);
        }

        ans += c / 3;
        if (c % 3 > 0) {
            ans++;
        }

        System.out.println(ans);
    }
}
