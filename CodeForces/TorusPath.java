import java.util.*;

public class TorusPath {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        int n = sc.nextInt();
        long[][] grid = new long[n][n];
        long sum = 0, mn = Long.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                grid[i][j] = sc.nextLong();
                sum += grid[i][j];
            }
            mn = Math.min(mn, grid[i][n - 1 - i]);
        }
        System.out.println(sum - mn);
    }
}
