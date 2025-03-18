import java.util.*;

public class GameWithMarbles1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        TreeSet<Pair> s = new TreeSet<>((p1, p2) -> p1.sum == p2.sum ? Integer.compare(p1.index, p2.index) : Long.compare(p2.sum, p1.sum));

        for (int i = 0; i < n; i++) {
            s.add(new Pair(a[i] + b[i], i));
        }

        int t = 1;
        long ans = 0;

        while (!s.isEmpty()) {
            Pair p = s.pollFirst();
            int i = p.index;
            if (t == 1) {
                ans += a[i] - 1;
            } else {
                ans -= b[i] - 1;
            }
            t ^= 1;
        }

        System.out.println(ans);
    }

    static class Pair {
        long sum;
        int index;

        Pair(long sum, int index) {
            this.sum = sum;
            this.index = index;
        }
    }
}
