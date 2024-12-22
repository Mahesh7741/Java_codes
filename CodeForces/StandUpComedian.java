import java.util.*;

public class StandUpComedian {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long a1 = sc.nextLong();
        long a2 = sc.nextLong();
        long a3 = sc.nextLong();
        long a4 = sc.nextLong();

        if (a1 == 0) {
            System.out.println(1);
        } else {
            System.out.println(a1 + Math.min(a2, a3) * 2 + Math.min(a1 + 1, Math.abs(a2 - a3) + a4));
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
