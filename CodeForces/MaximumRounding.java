import java.util.*;

public class MaximumRounding {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        int last = sb.length();

        for (int i = sb.length() - 1; i >= 0; --i) {
            if (sb.charAt(i) >= '5') {
                if (i - 1 < 0) {
                    sb.insert(0, '1');
                    last = i + 1;
                } else {
                    sb.setCharAt(i - 1, (char) (sb.charAt(i - 1) + 1));
                    last = i;
                }
            }
        }

        for (int i = last; i < sb.length(); ++i) {
            sb.setCharAt(i, '0');
        }

        System.out.println(sb.toString());
    }
}
