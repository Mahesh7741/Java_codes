import java.util.*;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int mx = 1;  
        int val = 1; 
        
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                val++;
            } else {
                mx = Math.max(mx, val); 
                val = 1; 
            }
        }
        
        mx = Math.max(mx, val); 
        System.out.println(mx);
        sc.close();
    }
}
