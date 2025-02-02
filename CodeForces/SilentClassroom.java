import java.util.*;

public class SilentClassroom {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character, Integer> m = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            m.put(s.charAt(0), m.getOrDefault(s.charAt(0), 0) + 1);
        }
        
        long ans = 0;
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            int y = entry.getValue();
            int c1 = y / 2;
            int c2 = y - c1;
            long p1 = (long) c1 * (c1 - 1) / 2;
            long p2 = (long) c2 * (c2 - 1) / 2;
            ans += p1 + p2;
        }
        
        System.out.println(ans);
        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
