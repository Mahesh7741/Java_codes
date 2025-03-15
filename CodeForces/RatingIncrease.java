import java.util.*;

public class RatingIncrease {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        String s = sc.next();
        int n = s.length();

        for (int i = 1; i < n; i++) {
            String a = s.substring(0, i);
            String b = s.substring(i);

            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);

            if (x < y && a.charAt(0) != '0' && b.charAt(0) != '0') {
                System.out.println(x + " " + y);
                return;
            }
        }
        System.out.println(-1);
    }
}
