import java.util.*;

public class PresentFromLena {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        new PresentFromLena().solve();
    }
    
    void solve() {
        int n = sc.nextInt();
        n++;
        
        for (int i = 1; i <= n; ++i) {
            int p = 0;
            
            for (int j = i; j < n; ++j)
                System.out.print("  ");
            
            for (int j = 0; j < i - 1; ++j) {
                System.out.print(p++);
                if (j + 1 < i) System.out.print(" ");
            }
            
            for (int j = 0; j < i; ++j) {
                System.out.print(p--);
                if (j + 1 < i) System.out.print(" ");
            }
            
            System.out.println();
        }
        
        n--;
        
        for (int i = 0; i <= n; ++i) {
            int p = 0;
            
            for (int j = 0; j <= i; ++j)
                System.out.print("  ");
            
            for (int j = i; j < n - 1; ++j) {
                System.out.print(p++);
                if (j + 1 < n) System.out.print(" ");
            }
            
            for (int j = i; j < n; ++j) {
                System.out.print(p--);
                if (j + 1 < n) System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
