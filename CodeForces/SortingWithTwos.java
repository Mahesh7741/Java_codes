import java.util.*;
public class SortingWithTwos {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();

        for (int i = 3; i < n; ++i) {
            if (v[i] < v[i - 1] && (i & (i - 1)) != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}
