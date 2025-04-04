import java.util.*;

public class Prefiquence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int TC = 1; TC <= TCS; ++TC) {
            // System.out.print("Case " + TC + ": ");
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        
        int ans = 0;
        for (int i = 0, j = 0; i < n && j < m; ++j) {
            if (a.charAt(i) == b.charAt(j)) {
                ans++;
                i++;
            }
        }
        System.out.println(ans);
    }
}
