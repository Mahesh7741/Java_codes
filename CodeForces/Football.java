import java.util.*;
public class Football {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        HashMap<String, Long> hMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String t = sc.next();
            hMap.put(t, hMap.getOrDefault(t, 0L) + 1);
        }

        long maxCount = 0;
        String ans = "";

        for (Map.Entry<String, Long> entry : hMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                ans = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        solve();
    }
}
