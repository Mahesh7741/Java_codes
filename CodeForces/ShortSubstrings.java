import java.util.*;
public class ShortSubstrings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        String b = sc.next();
        StringBuilder a = new StringBuilder(b.substring(0, 2));

        for (int i = 3; i < b.length(); i += 2) {
            a.append(b.charAt(i));
        }

        System.out.println(a);
    }
}
