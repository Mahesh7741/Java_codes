import java.util.*;
public class MilicaAndString {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int ct = 0;

        for (char c : s.toCharArray()) {
            if (c == 'B') ct++;
        }

        if (ct == k) {
            System.out.println(0);
            return;
        }

        if (ct > k) {
            int ctb = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == 'B') ctb++;
                if (ctb == ct - k) {
                    System.out.println(1);
                    System.out.println((i + 1) + " A");
                    return;
                }
            }
        } else {
            int cta = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == 'A') cta++;
                if (cta == k - ct) {
                    System.out.println(1);
                    System.out.println((i + 1) + " B");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}
