import java.util.*;

public class SatisfyingConstraints {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        int mn = 0, mx = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            if (t == 1)
                mn = Math.max(mn, x);
            else if (t == 2)
                mx = Math.min(mx, x);
            else
                v.add(x);
        }

        int ans = mx - mn;
        if (ans < 0) {
            System.out.println(0);
            return;
        }

        for (int ele : v) {
            if (ele >= mn && ele <= mx)
                ans--;
        }

        System.out.println(ans + 1);
    }
}
