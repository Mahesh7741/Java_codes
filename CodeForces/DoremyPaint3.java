import java.util.*;
public class DoremyPaint3 {
    static Scanner sc = new Scanner(System.in);
    
    public static void solve() {
        int n = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        
        if (m.size() > 2) {
            System.out.println("NO");
        } else if (m.size() == 1) {
            System.out.println("YES");
        } else {
            for (int freq : m.values()) {
                if (freq < n / 2) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
    
    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}
