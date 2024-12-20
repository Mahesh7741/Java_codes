import java.util.*;

public class SecretSport {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        String s = sc.next();

        System.out.println(s.charAt(n - 1));
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
