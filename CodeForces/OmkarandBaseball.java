import java.util.*;

public class OmkarandBaseball {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        boolean ok = true;
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x != i) ok = false;
            else if (!ok && x == i) {
                ans++;
                ok = true;
            }
        }

        if (!ok) ans++;
        System.out.println(Math.min(ans, 2));
    }
}
	