import java.util.*;

public class MiddleOfTheContest {
    
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String e = sc.next();
        
        int h1 = Integer.parseInt(s.substring(0, 2));
        int m1 = Integer.parseInt(s.substring(3, 5));
        int h2 = Integer.parseInt(e.substring(0, 2));
        int m2 = Integer.parseInt(e.substring(3, 5));
        
        int t1 = h1 * 60 + m1;
        int t2 = h2 * 60 + m2;
        int t = (t1 + t2) / 2;
        
        int h = t / 60;
        int m = t % 60;
        
        System.out.printf("%02d:%02d\n", h, m);
        sc.close();
    }
    
    public static void main(String[] args) {
        solve();
    }
}
