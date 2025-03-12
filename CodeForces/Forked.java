import java.util.*;

public class Forked {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int a = sc.nextInt(), b = sc.nextInt();
        int k1 = sc.nextInt(), k2 = sc.nextInt();
        int q1 = sc.nextInt(), q2 = sc.nextInt();

        Set<Pair> k = new HashSet<>();
        Set<Pair> q = new HashSet<>();
        
        int[] x = {-1, 1, -1, 1};
        int[] y = {-1, -1, 1, 1};

        for (int i = 0; i < 4; i++) {
            k.add(new Pair(k1 + a * x[i], k2 + b * y[i]));
            k.add(new Pair(k1 + b * x[i], k2 + a * y[i]));
            q.add(new Pair(q1 + a * x[i], q2 + b * y[i]));
            q.add(new Pair(q1 + b * x[i], q2 + a * y[i]));
        }

        int ct = 0;
        for (Pair p : k) {
            if (q.contains(p)) {
                ct++;
            }
        }
        System.out.println(ct);
    }

    static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}
