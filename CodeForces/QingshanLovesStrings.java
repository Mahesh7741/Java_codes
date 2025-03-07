import java.util.*;
public class QingshanLovesStrings {
    static Scanner sc = new Scanner(System.in);
    
    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        
        boolean valid = true;
        
        for (int i = 1; i < m; ++i) {
            if (t.charAt(i) == t.charAt(i - 1)) {
                valid = false;
                break;
            }
        }
        
        for (int i = 1; i < n; ++i) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                if (s.charAt(i - 1) == t.charAt(0) || s.charAt(i) == t.charAt(m - 1) || !valid) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        
        System.out.println("YES");
    }
    
    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}
