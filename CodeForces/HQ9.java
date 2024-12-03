import java.util.*;

public class HQ9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        String s = sc.next();
        boolean isTrue = false;

        for (char ch : s.toCharArray()) {
            if ((ch >= 33 && ch <= 126) && (ch == 'H' || ch == 'Q' || ch == '9')) {
                isTrue = true;
                break;
            }
        }

        System.out.println(isTrue ? "YES" : "NO");
    }
}
