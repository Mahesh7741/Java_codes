import java.util.*;

public class InaccurateSubsequenceSearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        Map<Integer, Integer> cta = new HashMap<>();
        Map<Integer, Integer> ctb = new HashMap<>();

        for (int x : b) ctb.put(x, ctb.getOrDefault(x, 0) + 1);
        for (int i = 0; i < m; i++) cta.put(a[i], cta.getOrDefault(a[i], 0) + 1);

        int ans = 0, ct = 0;

        for (Map.Entry<Integer, Integer> entry : ctb.entrySet()) {
            int key = entry.getKey();
            ct += Math.min(cta.getOrDefault(key, 0), entry.getValue());
        }

        if (ct >= k) ans++;

        for (int i = m; i < n; i++) {
            int removed = a[i - m];
            int added = a[i];

            if (cta.get(removed) == 1) cta.remove(removed);
            else cta.put(removed, cta.get(removed) - 1);

            if (ctb.containsKey(removed) && ctb.get(removed) > cta.getOrDefault(removed, 0)) ct--;

            cta.put(added, cta.getOrDefault(added, 0) + 1);

            if (ctb.containsKey(added) && ctb.get(added) >= cta.get(added)) ct++;

            if (ct >= k) ans++;
        }

        System.out.println(ans);
    }
}
