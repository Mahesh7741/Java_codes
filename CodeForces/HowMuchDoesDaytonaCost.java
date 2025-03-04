import java.util.*;
public class HowMuchDoesDaytonaCost {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- >0) solve();
    }

    static void solve() {
        int n = sc.nextInt(), k = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; ++i) v[i] = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            if (v[i] == k) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
