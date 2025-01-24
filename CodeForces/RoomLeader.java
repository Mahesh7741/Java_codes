import java.util.*;

public class RoomLeader {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        new RoomLeader().solve();
    }
    
    void solve() {
        int n = sc.nextInt();
        Map<Integer, String> m = new TreeMap<>(Collections.reverseOrder());
        
        for (int i = 0; i < n; ++i) {
            String s = sc.next();
            int r = sc.nextInt();
            int w = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int p = r * 100 - w * 50 + a + b + c + d + e;
            m.put(p, s);
        }
        Map.Entry<Integer, String> entry = m.entrySet().iterator().next();
        System.out.println(entry.getValue());
    }
}
