import java.util.Scanner;

public class TilingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        char[][] a = new char[(int) n + 5][(int) n + 5];
        
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < n; j++) {
                a[i][j] = row.charAt(j);
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == '.') {
                    if (i + 2 < n && j - 1 >= 0 && j + 1 < n 
                        && a[i + 1][j - 1] == '.' && a[i + 1][j] == '.' 
                        && a[i + 1][j + 1] == '.' && a[i + 2][j] == '.') {
                        a[i][j] = '#';
                        a[i + 1][j - 1] = '#';
                        a[i + 1][j] = '#';
                        a[i + 1][j + 1] = '#';
                        a[i + 2][j] = '#';
                    }
                }
            }
        }
        
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != '#') {
                    ok = false;
                    break;
                }
            }
            if (!ok) break;
        }
        
        if (ok) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
