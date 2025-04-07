import java.util.*;

public class ShiftsAndSorting {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        String s = sc.next();
        long ans = 0, ct = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ct++;
            } else if (c == '0' && ct > 0) {
                ans += ct + 1;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }
}
