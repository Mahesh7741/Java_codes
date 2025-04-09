import java.util.*;

public class CirclePerimeter {
    static Scanner sc = new Scanner(System.in);

    static long points(long r) {
        long p = 0;
        for (long x = 0; x <= r; ++x) {
            long y = 0;
            long d = (r + 1) * (r + 1) - x * x;
            long l = 0, h = r;
            while (l <= h) {
                long mid = l + (h - l) / 2;
                if (mid * mid < d) {
                    y = mid;
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
            if (x == 0) {
                p += (y * 2 + 1);
            } else {
                p += ((y * 2 + 1) * 2);
            }
        }
        return p;
    }

    static void solve() {
        long r = sc.nextLong();
        long p1 = points(r);
        long p2 = points(r - 1);
        System.out.println(p1 - p2);
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int t = 0; t < TCS; t++) {
            solve();
        }
    }
}
