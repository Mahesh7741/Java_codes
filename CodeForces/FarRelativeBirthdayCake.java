import java.util.Scanner;

public class FarRelativeBirthdayCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] matrix = new char[n + 1][n + 1];
        int[] row = new int[n + 1];
        int[] column = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            String line = scanner.next(); 
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = line.charAt(j - 1); 
            }
        }
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int co = 0;
            for (int j = 1; j <= n; j++) {
                if (matrix[i][j] == 'C') {
                    sum++;
                }
                if (matrix[j][i] == 'C') {
                    co++;
                }
            }
            row[i] = (sum * (sum - 1)) / 2;
            column[i] = (co * (co - 1)) / 2;
        }
        int val = 0;
        for (int i = 1; i <= n; i++) {
            val += row[i] + column[i];
        }

        System.out.println(val);
        scanner.close();
    }
}
