import java.util.*;

public class WeWereBothChildren {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();

        long[] arr = new long[(int) n];
        Map<Long, Long> hMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            hMap.put(arr[i], hMap.getOrDefault(arr[i], 0L) + 1);
        }

        long[] points = new long[(int) n + 1];

        for (Map.Entry<Long, Long> entry : hMap.entrySet()) {
            long key = entry.getKey();
            long value = entry.getValue();

            for (long i = key; i <= n; i += key) {
                points[(int) i] += value;
            }
        }

        long ans = Arrays.stream(points).max().orElse(0);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
