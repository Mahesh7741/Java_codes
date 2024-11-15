import java.util.Scanner;

public class PenchickAndModernMonument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int pillars = scanner.nextInt();
            int[] heights = new int[pillars];
            for (int j = 0; j < pillars; j++) {
                heights[j] = scanner.nextInt();
            }
            System.out.println(calculateMinOperations(heights, pillars));
        }
    }

    public static int calculateMinOperations(int[] heights, int pillars) {
        int[] frequency = new int[pillars];
        for (int i = 0; i < pillars; i++) {
            frequency[heights[i] - 1]++;
        }
        int maxFrequency = 0;
        for (int i = 0; i < pillars; i++) {
            maxFrequency = Math.max(maxFrequency, frequency[i]);
        }
        return pillars - maxFrequency;
    }
}