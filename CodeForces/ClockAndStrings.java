import java.util.*;

public class ClockAndStrings {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long low = Math.min(a, b);
        long high = Math.max(a, b);
        int count = 0;

        if (c >= low && c <= high) count++;
        if (d >= low && d <= high) count++;

        if ((count & 1) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        while (TCS-- > 0) {
            solve();
        }
    }
}
