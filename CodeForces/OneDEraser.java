import java.util.*;

public class OneDEraser {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        String s = sc.next();

        long operations = 0;

        for (long i = 0; i < n; i++) {
            if (s.charAt((int) i) == 'B') {
                operations++;
                i += k - 1;
            }
        }
        System.out.println(operations);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
