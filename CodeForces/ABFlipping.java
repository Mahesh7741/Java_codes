import java.util.*;
public class ABFlipping {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        int pta = n, ptb = 0;

        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'A') {
                pta = Math.min(i, pta);
            }
            if (s.charAt(i) == 'B') {
                ptb = Math.max(i, ptb);
            }
        }

        if (pta > ptb)
            System.out.println(0);
        else
            System.out.println(ptb - pta);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}
