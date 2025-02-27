import java.util.*;

public class AssemblyViaMinimums {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < n * (n - 1) / 2; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int x = 0;
        StringBuilder result = new StringBuilder();
        for (var entry : map.entrySet()) {
            while (entry.getValue() > 0) {
                result.append(entry.getKey()).append(" ");
                map.put(entry.getKey(), entry.getValue() - x);
                x++;
            }
        }
        System.out.println(result);
    }
}
