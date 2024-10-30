import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Shooting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Integer[] b = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        
        Arrays.sort(b, Collections.reverseOrder());
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans++;
            } else {
                ans += b[i] * i + 1;
            }
        }
        
        System.out.println(ans);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i].equals(a[j])) {
                    a[j] = 0;
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
        }
        
        System.out.println();
        sc.close();
    }
}
