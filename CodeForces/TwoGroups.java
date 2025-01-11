import java.util.*;

public class TwoGroups {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();

        long sumOfPos = 0, sumOfNeg = 0;

        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();

            if (t > 0)
                sumOfPos += t;
            else
                sumOfNeg += t;
        }

        System.out.println(Math.abs(Math.abs(sumOfNeg) - sumOfPos));
    }
}
