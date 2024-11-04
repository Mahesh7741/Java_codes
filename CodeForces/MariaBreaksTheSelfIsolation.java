import java.util.*;

public class MariaBreaksTheSelfIsolation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int flag = 0;
            int n = sc.nextInt();
            long[] a = new long[100001];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            Arrays.sort(a, 0, n);
            
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] <= i + 1) {
                    System.out.println(i + 2);
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 0) {
                System.out.println(1);
            }
        }
        
        sc.close();
    }
}
