import java.util.*;

public class MinimizeInversions {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        List<Pair> a = new ArrayList<>();
        int[] b = new int[n];

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            a.add(new Pair(x, i));
        }

        for (int i = 0; i < n; ++i) {
            b[i] = sc.nextInt();
        }

        // Sorting list based on first value (x)
        Collections.sort(a, Comparator.comparingInt(p -> p.x));

        for (Pair p : a) {
            System.out.print(p.x + " ");
        }
        System.out.println();

        for (int i = 0; i < n; ++i) {
            System.out.print(b[a.get(i).idx] + " ");
        }
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
