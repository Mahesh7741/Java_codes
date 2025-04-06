import java.util.*;

public class EqualXORSegments {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] v = new int[n + 1];
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        v[0] = 0;
        map.put(0, new ArrayList<>(List.of(0)));

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt() ^ v[i - 1];
            map.computeIfAbsent(v[i], k -> new ArrayList<>()).add(i);
        }

        while (q-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt();
            if (v[l - 1] == v[r]) {
                System.out.println("YES");
                continue;
            }
            List<Integer> v1 = map.getOrDefault(v[r], new ArrayList<>());
            List<Integer> v2 = map.getOrDefault(v[l - 1], new ArrayList<>());
            Integer it1 = lowerBound(v1, l);
            Integer it2 = lowerBoundRev(v2, r);
            if (it1 != null && it2 != null && it1 < it2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        System.out.println();
    }

    static Integer lowerBound(List<Integer> list, int val) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) < val) l = m + 1;
            else r = m;
        }
        return l < list.size() ? list.get(l) : null;
    }

    static Integer lowerBoundRev(List<Integer> list, int val) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) < val) l = m + 1;
            else r = m;
        }
        return r > 0 ? list.get(r - 1) : null;
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int tc = 1; tc <= TCS; tc++) {
            solve();
        }
    }
}
