import java.util.*;

public class PermutationGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int TC = 1; TC <= TCS; ++TC) {
            // System.out.print("Case " + TC + ": ");
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong(), k = sc.nextLong();
        int pb = sc.nextInt(), ps = sc.nextInt();
        int[] p = new int[(int) n];
        long[] a = new long[(int) n];

        for (int i = 0; i < n; ++i) p[i] = sc.nextInt();
        for (int i = 0; i < n; ++i) a[i] = sc.nextLong();

        List<Long> pathB = find(p, a, pb);
        List<Long> pathS = find(p, a, ps);

        long bs = score(pathB, k);
        long ss = score(pathS, k);

        if (bs == ss) System.out.println("Draw");
        else if (bs > ss) System.out.println("Bodya");
        else System.out.println("Sasha");
    }

    static List<Long> find(int[] p, long[] a, int pos) {
        int n = p.length;
        boolean[] vis = new boolean[n];
        List<Long> path = new ArrayList<>();

        while (!vis[pos - 1]) {
            vis[pos - 1] = true;
            path.add(a[pos - 1]);
            pos = p[pos - 1];
        }

        return path;
    }

    static long score(List<Long> path, long k) {
        long sum = 0, mx = 0;

        for (int i = 0; i < path.size(); ++i) {
            if (k < i + 1) break;
            long cur = sum + path.get(i) * (k - i);
            mx = Math.max(mx, cur);
            sum += path.get(i);
        }

        return mx;
    }
}
