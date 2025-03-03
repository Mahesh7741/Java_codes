import java.util.*;
public class GoodKid {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
    
    static void solve() {
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) 
            v[i] = sc.nextInt();
        
        Arrays.sort(v);
        v[0]++;
        
        long pro = 1;
        for (int i = 0; i < n; i++) 
            pro *= v[i];
        
        System.out.println(pro);
    }
}
