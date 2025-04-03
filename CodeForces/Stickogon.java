import java.util.*;

public class Stickogon {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int ans = 0;
        for (int freq : map.values()) {
            ans += freq / 3;
        }

        System.out.println(ans);
    }
}
