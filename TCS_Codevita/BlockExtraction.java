import java.util.*;

public class BlockExtraction {

    static class Block {
        Set<int[]> cells = new HashSet<>();

        void addCell(int i, int j) {
            cells.add(new int[]{i, j});
        }

        Set<int[]> getCells() {
            return cells;
        }
    }

    // Function to find all connected blocks
    public static Map<Integer, Block> findConnectedBlocks(int[][] grid, int N, int M) {
        Map<Integer, Block> blocks = new HashMap<>();
        boolean[][] visited = new boolean[N][M];

        int[] dx = {1, -1, 0, 0}; // Directions: down, up, right, left
        int[] dy = {0, 0, 1, -1};

        // DFS to explore connected cells
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    int blockNum = grid[i][j];
                    Block block = new Block();
                    dfs(i, j, blockNum, grid, visited, block, N, M, dx, dy);
                    blocks.put(blockNum, block);
                }
            }
        }

        return blocks;
    }

    private static void dfs(int i, int j, int blockNum, int[][] grid, boolean[][] visited, Block block, int N, int M, int[] dx, int[] dy) {
        visited[i][j] = true;
        block.addCell(i, j);

        for (int d = 0; d < 4; d++) {
            int ni = i + dx[d], nj = j + dy[d];
            if (ni >= 0 && nj >= 0 && ni < N && nj < M && !visited[ni][nj] && grid[ni][nj] == blockNum) {
                dfs(ni, nj, blockNum, grid, visited, block, N, M, dx, dy);
            }
        }
    }

    // Function to calculate dependencies
    public static int findDependencies(Map<Integer, Block> blocks, int[][] grid, int N, int M, int target) {
        Map<Integer, Integer> blockTops = new HashMap<>();

        for (Map.Entry<Integer, Block> entry : blocks.entrySet()) {
            int blockNum = entry.getKey();
            Block block = entry.getValue();

            // Find the topmost row for each block
            int minRow = Integer.MAX_VALUE;
            for (int[] cell : block.getCells()) {
                minRow = Math.min(minRow, cell[0]);
            }
            blockTops.put(blockNum, minRow);
        }

        Set<int[]> targetCells = blocks.get(target).getCells();
        int targetTop = blockTops.get(target);
        Set<Integer> blocksToRemove = new HashSet<>();

        for (Map.Entry<Integer, Block> entry : blocks.entrySet()) {
            int blockNum = entry.getKey();
            if (blockNum == target) continue;

            int blockTop = blockTops.get(blockNum);

            // Check if the block overlaps with the target
            if (blockTop <= targetTop) {
                Set<Integer> targetColumns = new HashSet<>();
                Set<Integer> blockColumns = new HashSet<>();

                for (int[] cell : targetCells) {
                    targetColumns.add(cell[1]);
                }
                for (int[] cell : entry.getValue().getCells()) {
                    blockColumns.add(cell[1]);
                }

                // If columns overlap, mark this block for removal
                for (int col : targetColumns) {
                    if (blockColumns.contains(col)) {
                        blocksToRemove.add(blockNum);
                        break;
                    }
                }
            }
        }

        return blocksToRemove.size();
    }

    public static void solveBlockExtraction() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] grid = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int target = scanner.nextInt();

        // Find connected blocks and dependencies
        Map<Integer, Block> blocks = findConnectedBlocks(grid, N, M);
        int result = findDependencies(blocks, grid, N, M, target);

        System.out.println(result);
        scanner.close();
    }

    public static void main(String[] args) {
        solveBlockExtraction();
    }
}
