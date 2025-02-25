import java.util.*;

public class EscalatorConversations {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int H = sc.nextInt();
        
        int[] v = new int[n];
        for (int i = 0; i < n; i++)
            v[i] = sc.nextInt();

        int ct = 0;
        for (int i = 0; i < n; i++) {
            int d = Math.abs(H - v[i]);
            if (d <= (m - 1) * k && d % k == 0 && v[i] != H)
                ct++;
        }
        System.out.println(ct);
    }
}
