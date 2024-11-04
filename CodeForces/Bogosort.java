import java.util.*;

public class Bogosort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[105];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a, 0, n);
            for (int i = 0; i < n / 2; i++) {
                int temp = a[i];
                a[i] = a[n - 1 - i];
                a[n - 1 - i] = temp;
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
