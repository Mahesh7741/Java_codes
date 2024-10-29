import java.util.Arrays;
import java.util.Scanner;

public class GrowTheTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] v = new long[(int) n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        Arrays.sort(v);
        long i = 0, j = n - 1;
        long x = 0, y = 0;

        boolean ok = false;
        while (i <= j) {
            if (ok) {
                x += v[(int) i];  
                i++;
            } else {
                y += v[(int) j];  
                j--;
            }
            ok ^= true; 
        }

        long ans = x * x + y * y;
        System.out.println(ans);

        sc.close();
    }
}
