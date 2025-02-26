import java.util.*;

public class GoodArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        long sum = 0;
        int ct = 0;
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) ct++;
            sum += x;
        }
        
        if (sum >= ct + n && n > 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
