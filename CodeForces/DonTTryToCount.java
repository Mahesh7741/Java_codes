import java.util.*;
public class DonTTryToCount {
    static Scanner sc = new Scanner(System.in);
    
    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String x = sc.next();
        String s = sc.next();
        
        for (int i = 0; i <= 10; ++i) {
            if (x.contains(s)) {
                System.out.println(i);
                return;
            }
            x += x;
        }
        System.out.println(-1);
    }
    
    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}
