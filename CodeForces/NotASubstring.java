import java.util.*;

public class NotASubstring {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        String s = sc.next();
        StringBuilder t = new StringBuilder();
        boolean nested = false;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                nested = true;
                break;
            }
        }

        if (s.equals("()")) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

        if (nested) {
            for (int i = 0; i < s.length(); i++) {
                t.append("()");
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                t.append('(');
            }
            for (int i = 0; i < s.length(); i++) {
                t.append(')');
            }
        }

        System.out.println(t);
    }
}
