import java.util.*;

public class ShortSort {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
    
    static void solve() {
        String s = sc.next();
        if (s.charAt(0) == 'a' || s.charAt(1) == 'b' || s.charAt(2) == 'c')
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
