import java.util.*;

public class ArrangingCats {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        String f = sc.next();

        int x = 0, y = 0, m = 0;
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '1') x++;
            if (f.charAt(i) == '1') y++;
            if (s.charAt(i) != f.charAt(i)) m++;
        }

        int r = Math.abs(x - y);
        int ans = r + (m - r) / 2;
        System.out.println(ans);
    }
}
