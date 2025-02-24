import java.util.*;

public class Monsters {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Pair> v = new ArrayList<>();

        for (int i = 1; i <= n; ++i) {
            int x = sc.nextInt();
            if (x % k != 0)
                x %= k;
            else
                x = k;
            v.add(new Pair(x, i));
        }

        v.sort((a, b) -> (a.x == b.x) ? Integer.compare(a.idx, b.idx) : Integer.compare(b.x, a.x));

        for (Pair it : v)
            System.out.print(it.idx + " ");
        System.out.println();
    }

    static class Pair {
        int x, idx;

        Pair(int x, int idx) {
            this.x = x;
            this.idx = idx;
        }
    }
}
