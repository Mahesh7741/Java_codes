import java.util.*;
public class TheLakes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][m];
        int[] dX = {0, 1, 0, -1};
        int[] dY = {1, 0, -1, 0};

        long maxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0 && !visited[i][j]) {
                    long[] currSum = new long[1];
                    dfs(i, j, grid, visited, currSum, dX, dY);
                    maxSum = Math.max(maxSum, currSum[0]);
                }
            }
        }

        System.out.println(maxSum);
    }

    public static void dfs(int row, int col, int[][] grid, boolean[][] visited, long[] currSum, int[] dX, int[] dY) {
        int n = grid.length, m = grid[0].length;
        visited[row][col] = true;
        currSum[0] += grid[row][col];

        for (int i = 0; i < 4; i++) {
            int newRow = row + dX[i];
            int newCol = col + dY[i];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && 
                grid[newRow][newCol] != 0 && !visited[newRow][newCol]) {
                dfs(newRow, newCol, grid, visited, currSum, dX, dY);
            }
        }
    }
}
