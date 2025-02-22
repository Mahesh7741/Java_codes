import java.util.*;

public class AD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) 
            solve();
    }

    static void solve() {
        int n = sc.nextInt();
        int last = 0, ans = 0;
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            if (i == 0) {
                last = x & 1;
                continue;
            }
            if ((last + x) % 2 == 0) 
                ans++;
            last = x & 1;
        }
        System.out.println(ans);
    }
}
