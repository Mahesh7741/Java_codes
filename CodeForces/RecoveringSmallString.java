import java.util.*;

public class RecoveringSmallString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long first = Math.max(1, n - 52);
        long second = Math.max(1, n - first - 26);
        long third = Math.max(1, n - first - second);

        System.out.println((char) (first + 'a' - 1) + "" + (char) (second + 'a' - 1) + (char) (third + 'a' - 1));
    }
}
