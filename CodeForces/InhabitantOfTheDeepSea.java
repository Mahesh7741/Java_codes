import java.util.*;

public class InhabitantOfTheDeepSea {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        Deque<Long> d = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            d.addLast(sc.nextLong());
        }

        int f = 1, ans = 0;

        while (k > 0 && !d.isEmpty()) {
            if (d.size() == 1) {
                if (d.peekFirst() <= k) ans++;
                break;
            }

            long x = d.peekFirst();
            long y = d.peekLast();
            long z = Math.min(x, y);

            d.pollFirst();
            d.pollLast();

            if (f == 1) {
                if (z == x) {
                    if (k < 2 * z - 1) break;
                    k -= 2 * z - 1;
                    y -= (z - 1);
                    f = 0;
                    d.addLast(y);
                    ans++;
                } else {
                    if (k < 2 * z) break;
                    k -= 2 * z;
                    x -= z;
                    d.addFirst(x);
                    ans++;
                }
            } else {
                if (z == y) {
                    if (k < 2 * z - 1) break;
                    k -= 2 * z - 1;
                    x -= (z - 1);
                    f = 1;
                    d.addFirst(x);
                    ans++;
                } else {
                    if (k < 2 * z) break;
                    k -= 2 * z;
                    y -= z;
                    d.addLast(y);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
