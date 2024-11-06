import java.util.Scanner;
import java.util.Arrays;

public class PolycarpTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long[] a = new long[(int) n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a); 

        long k = 1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (k <= a[i]) {
                ans++;
                k++;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
