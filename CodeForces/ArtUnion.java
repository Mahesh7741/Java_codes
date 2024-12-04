import java.util.*;

public class ArtUnion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] needTime = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                needTime[i][j] = sc.nextInt();
            }
        }

        int[] dp = new int[m + 1];

        // Assigning all time for the first painter
        for (int i = 0; i < m; i++) {
            dp[i + 1] = needTime[i][0] + dp[i];
        }

        // Finding the optimal answer
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (i == 0) {
                    dp[i + 1] += needTime[i][j];
                } else {
                    int temp = Math.max(dp[i], dp[i + 1]);
                    dp[i + 1] = temp + needTime[i][j];
                }
            }
        }

        for (int i = 1; i <= m; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }
}
