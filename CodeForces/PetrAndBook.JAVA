import java.util.*;
public class PetrAndBook {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        long n = sc.nextLong();
        long[] days = new long[7];

        for (int i = 0; i < 7; i++)
            days[i] = sc.nextLong();

        long total = 0;
        for (int i = 0; ; i = (i + 1) % 7) {
            total += days[i];
            if (total >= n) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
