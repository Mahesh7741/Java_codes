import java.util.*;

public class CollectingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Pair> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a.add(new Pair(sc.nextLong(), i));
            }

            Collections.sort(a, Comparator.comparingLong(p -> p.first));
            long cs = a.get(0).first;
            int[] stop = new int[n];

            for (int i = 1; i < n; i++) {
                if (cs < a.get(i).first) {
                    stop[i - 1] = 1;
                }
                cs += a.get(i).first;
            }

            int idx = n - 1;
            for (int i = n - 1; i >= 0; i--) {
                if (stop[i] == 1) {
                    idx = i;
                }
                stop[i] = idx;
            }

            int[] f = new int[n];
            for (int i = 0; i < n; i++) {
                f[a.get(i).second] = stop[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(f[i] + " ");
            }
            System.out.println();
        }
    }

    static class Pair {
        long first;
        int second;

        Pair(long first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
