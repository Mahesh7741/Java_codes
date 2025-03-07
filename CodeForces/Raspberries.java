import java.util.*;
public class Raspberries {
    static Scanner sc = new Scanner(System.in);
    
    public static void solve() {
        int n = sc.nextInt(), k = sc.nextInt();
        Map<Integer, Integer> mp = new HashMap<>();
        int ct = 0;
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) ct++;
            mp.put(x % k, mp.getOrDefault(x % k, 0) + 1);
        }
        
        if (mp.getOrDefault(0, 0) > 0) {
            System.out.println(0);
            return;
        }
        
        int ans = k - Collections.max(mp.keySet());
        ct = Math.max(0, 2 - ct);
        if (k % 4 == 0)
            ans = Math.min(ct, ans);
        
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int TC = 1; TC <= TCS; ++TC) {
            solve();
        }
    }
}
