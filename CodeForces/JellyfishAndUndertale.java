import java.util.*;
public class JellyfishAndUndertale {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
    
    static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        int n = sc.nextInt();
        long ans = b;
        
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            ans += Math.min(x, a - 1);
        }
        
        System.out.println(ans);
    }
}
