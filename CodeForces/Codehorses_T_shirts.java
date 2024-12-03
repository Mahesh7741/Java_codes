import java.util.*;

public class Codehorses_T_shirts {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        long n = sc.nextLong();
        String[] curr = new String[(int) n];
        String[] prev = new String[(int) n];
        Map<String, Long> setA = new HashMap<>();
        Map<String, Long> setB = new HashMap<>();

        for (int i = 0; i < n; i++) {
            curr[i] = sc.next();
            setA.put(curr[i], setA.getOrDefault(curr[i], 0L) + 1);
        }

        for (int i = 0; i < n; i++) {
            prev[i] = sc.next();
            setB.put(prev[i], setB.getOrDefault(prev[i], 0L) + 1);
        }

        long count = n;

        for (Map.Entry<String, Long> entry : setA.entrySet()) {
            count -= Math.min(entry.getValue(), setB.getOrDefault(entry.getKey(), 0L));
        }

        System.out.println(count);
    }
}
