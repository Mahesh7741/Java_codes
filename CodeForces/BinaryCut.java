import java.util.*;

public class BinaryCut {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        String s = sc.next();
        long ans = 1;
        int f = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                ans++;
            }
            if (s.charAt(i) == '1' && s.charAt(i - 1) == '0') {
                f = 1;
            }
        }

        System.out.println(ans - f);
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        while (TCS-- > 0) {
            solve();
        }
    }
}
