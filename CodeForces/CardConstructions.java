import java.util.*;
public class CardConstructions {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long cnt = 0;
        while (n > 2) {
            long t = 5;
            long now = 2;
            while (n >= t + now) {
                now = t + now;
                t += 3;
            }
            n -= now;
            cnt++;
        }
        if (n >= 2) cnt++;
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        int testcase = sc.nextInt();
        for (int t = 1; t <= testcase; t++) {
            solve();
        }
    }
}
