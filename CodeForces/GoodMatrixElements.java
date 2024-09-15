import java.util.Scanner;

public class GoodMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int mid = n / 2;  
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i];
        }
        for (int j = 0; j < n; j++) {
            if (j != mid && j != n - 1 - mid) {
                sum += matrix[mid][j];
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != mid && i != n - 1 - mid) {
                sum += matrix[i][mid];
            }
        }
        
        int midTerm= matrix[mid][mid];
        System.out.println(sum-midTerm);
        
        sc.close();
    }
}
