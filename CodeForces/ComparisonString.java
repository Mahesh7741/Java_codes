import java.util.*;

public class ComparisonString {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        int mx = 0;

        for (int i = 0; i < n; i++) {
            int ct = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    ct++;
                } else {
                    mx = Math.max(mx, ct);
                    ct = 1;
                    break;
                }
            }
            mx = Math.max(mx, ct);
        }

        int greaterMx = mx;
        mx = 0;

        for (int i = 0; i < n; i++) {
            int ct = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    ct++;
                } else {
                    mx = Math.max(mx, ct);
                    ct = 1;
                    break;
                }
            }
            mx = Math.max(mx, ct);
        }

        int smallerMx = mx;
        System.out.println(Math.max(greaterMx, smallerMx) + 1);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }
}
