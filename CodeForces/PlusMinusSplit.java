import java.util.*;

public class PlusMinusSplit {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '+') ans++;
            else ans--;
        }

        System.out.println(Math.abs(ans));
    }
}
