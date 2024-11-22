import java.util.*;

public class  IncreasingMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long total = 0;

        int[][] ara = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ara[i][j] = sc.nextInt();
            }
        }

        boolean valid = true;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (ara[i][j] == 0) {
                    int x = (j < m - 1) ? ara[i][j + 1] - 1 : Integer.MAX_VALUE;
                    int y = (i < n - 1) ? ara[i + 1][j] - 1 : Integer.MAX_VALUE;
                    ara[i][j] = Math.min(x, y);
                }

                if (j < m - 1 && ara[i][j] >= ara[i][j + 1]) {
                    valid = false;
                    break;
                }

                if (i < n - 1 && ara[i][j] >= ara[i + 1][j]) {
                    valid = false;
                    break;
                }
            }
            if (!valid) break;
        }

        if (!valid) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    total += ara[i][j];
                }
            }
            System.out.println(total);
        }
    }
}
