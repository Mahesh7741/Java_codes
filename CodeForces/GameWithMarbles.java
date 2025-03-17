import java.util.*;

public class GameWithMarbles {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        TreeSet<Pair> s = new TreeSet<>((p1, p2) -> p1.sum != p2.sum ? Long.compare(p2.sum, p1.sum) : Integer.compare(p1.index, p2.index));

        for (int i = 0; i < n; i++) {
            s.add(new Pair(a[i] + b[i], i));
        }

        boolean t = true;
        long ans = 0;

        while (!s.isEmpty()) {
            Pair p = s.pollFirst();
            int i = p.index;

            if (t) {
                ans += a[i] - 1;
            } else {
                ans -= b[i] - 1;
            }

            t = !t;
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
