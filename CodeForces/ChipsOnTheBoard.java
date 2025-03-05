import java.util.*;
public class ChipsOnTheBoard {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0, sum2 = 0;
            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                sum2 += b[i];
            }
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            long mini = Math.min((a[0] * n) + sum2, (b[0] * n) + sum);
            System.out.println(mini);
        }
    }
}
