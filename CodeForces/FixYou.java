import java.util.Scanner;

public class FixYou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the integer
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine(); // Consume the newline character after reading n and m
            
            char[][] a = new char[n][m];
            
            for (int i = 0; i < n; i++) {
                String row = sc.nextLine();
                for (int j = 0; j < m; j++) {
                    a[i][j] = row.charAt(j);
                }
            }
            
            int c = 0;
            
            for (int i = 0; i < n - 1; i++) {
                if (a[i][m - 1] == 'R') {
                    c++;
                    a[i][m - 1] = 'D';
                }
            }
            
            for (int j = 0; j < m - 1; j++) {
                if (a[n - 1][j] == 'D') {
                    c++;
                    a[n - 1][j] = 'R';
                }
            }
            
            System.out.println(c);
        }
        
        sc.close();
    }
}
