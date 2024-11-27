import java.util.*;
public class SeatArrangements {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] mat = new int[n + 1][m + 1];
        int[][] prefixRow = new int[n + 1][m + 1];
        int[][] prefixCol = new int[m + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String row = sc.next();
            for (int j = 1; j <= m; j++) {
                mat[i][j] = (row.charAt(j - 1) == '*') ? 0 : 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                prefixRow[i][j] = prefixRow[i][j - 1] + mat[i][j];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixCol[i][j] = prefixCol[i][j - 1] + mat[j][i];
            }
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = k; j <= m; j++) {
                if (prefixRow[i][j] - prefixRow[i][j - k] == k) ans++;
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = k; j <= n; j++) {
                if (prefixCol[i][j] - prefixCol[i][j - k] == k) ans++;
            }
        }

        if (k == 1) ans /= 2;

        System.out.println(ans);
    }
}
