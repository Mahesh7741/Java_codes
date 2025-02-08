import java.util.*;
public class Div7 {
    static Scanner sc = new Scanner(System.in);
    
    public static void solve() {
        int n = sc.nextInt();
        String s = Integer.toString(n);
        s = s.substring(0, s.length() - 1);
        
        if (n % 7 == 0) {
            System.out.println(n);
            return;
        }
        
        for (int i = 0; i < 10; ++i) {
            String temp = s + i;
            int x = Integer.parseInt(temp);
            if (x % 7 == 0) {
                System.out.println(x);
                return;
            }
        } 
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }
}
