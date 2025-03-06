import java.util.*;
public class PerfectSquare {
    static Scanner sc = new Scanner(System.in);
    
    public static void solve() {
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) 
            s[i] = sc.next();
        
        int ans = 0;
        ArrayList<Character> v = new ArrayList<>();
        
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                v.clear();
                v.add(s[i].charAt(j));
                v.add(s[j].charAt(n - i - 1));
                v.add(s[n - j - 1].charAt(i));
                v.add(s[n - i - 1].charAt(n - j - 1));
                
                Collections.sort(v);
                for (char c : v) 
                    ans += v.get(v.size() - 1) - c;
            }
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}

