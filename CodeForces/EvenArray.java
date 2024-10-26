import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 != a[i] % 2) {
                    if (a[i] % 2 == 1) {
                        odd++;
                    } else {
                        even++;
                    }
                }
            }
            
            if (odd != even) {
                System.out.println(-1);
            } else {
                System.out.println(even);
            }
        }
        
        sc.close();
    }
}
