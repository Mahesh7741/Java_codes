import java.util.*;
public class VikaAndHerFriends {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();

        long x = sc.nextLong();
        long y = sc.nextLong();

        String ans = "YES";
        for (int i = 0; i < k; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if ((x + y) % 2 == (a + b) % 2) {
                ans = "NO";
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
