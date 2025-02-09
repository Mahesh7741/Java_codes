import java.util.*;
public class ArrayCloningTechnique {
    static Scanner sc = new Scanner(System.in);

    public static long pow(long x, long y, long m) {
        long ans = 1;
        x %= m;
        while (y > 0) {
            if ((y & 1) == 1) ans = (ans * x) % m;
            x = (x * x) % m;
            y >>= 1;
        }
        return ans;
    }

    public static void solve() {
        int n = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        
        if (m.size() == 1) {
            System.out.println(0);
            return;
        }
        
        int ct = 0;
        for (int y : m.values()) {
            ct = Math.max(ct, y);
        }
        
        int r = n - ct;
        int ans = 0;
        
        while (ct < n) {
            ans += Math.min(r, ct) + 1;
            r -= ct;
            ct *= 2;
        }
        
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int TC = 1; TC <= TCS; ++TC) {
            solve();
        }
    }
}
