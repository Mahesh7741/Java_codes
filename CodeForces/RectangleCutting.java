import java.util.*;

public class RectangleCutting {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a % 2 == 0 && a / 2 != b) {
            System.out.println("YES");
        } else if (b % 2 == 0 && b / 2 != a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
