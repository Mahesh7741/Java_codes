import java.util.Scanner;

public class K_specialTables {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] a = new int[n][n];
        int m = n * n - n + k;
        a[0][k - 1] = m;

        for (int i = 1; i < n; i++) {
            a[i][k - 1] = a[i - 1][k - 1] - (n - k + 1);
        }

        for (int i = 0; i < n; i++) {
            m = a[i][k - 1] + 1;
            for (int j = k; j < n; j++) {
                a[i][j] = m;
                m++;
            }
        }

        m = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++) {
                a[i][j] = m;
                m++;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i][k - 1];
        }

        System.out.println(sum);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
