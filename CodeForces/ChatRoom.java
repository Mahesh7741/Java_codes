import java.util.*;

public class ChatRoom {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        String s = sc.next();
        String h = "hello";

        int i = 0, j = 0;

        while (i < s.length() && j < h.length()) {
            if (s.charAt(i) == h.charAt(j))
                j++;
            i++;
        }

        System.out.println(j == h.length() ? "YES" : "NO");
    }

    public static void main(String[] args) {
        solve();
    }
}
