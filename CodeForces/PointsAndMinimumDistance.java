import java.util.*;
public class PointsAndMinimumDistance {
    static Scanner sc = new Scanner(System.in);

    public static boolean cmp(long a, long b) {
        return a > b;
    }

    public static void solve() {
        int n = sc.nextInt();
        List<Long> v = new ArrayList<>();
        for (int i = 0; i < 2 * n; ++i)
            v.add(sc.nextLong());

        v.sort(Collections.reverseOrder());

        long x = 0, y = 0;
        for (int i = 1; i < n; ++i)
            x += v.get(i - 1) - v.get(i);
        for (int i = n + 1; i < 2 * n; ++i)
            y += v.get(i - 1) - v.get(i);

        System.out.println(x + y);

        List<Pair> p = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            p.add(new Pair(v.get(i), v.get(n + i)));

        for (Pair pr : p)
            System.out.println(pr.first + " " + pr.second);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}

class Pair {
    long first, second;
    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}
