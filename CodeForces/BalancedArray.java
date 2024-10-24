import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 4 != 0) {
                System.out.println("NO");
                continue;
            }
            
            long[] a = new long[n];
            int index = 0;
            
            for (int i = 2; i <= n; i += 2) {
                a[index++] = i;
            }
            
            for (int i = 1; i < n - 1; i += 2) {
                a[index++] = i;
            }
            
            a[index] = n - 1 + (n / 2);
            
            System.out.println("YES");
            for (long num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
