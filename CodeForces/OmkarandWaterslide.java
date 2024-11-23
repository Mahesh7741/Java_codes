import java.util.*;
public class OmkarandWaterslide {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long op = 0;
            for (int i = n - 2; i >= 0; i--) {
                if (a[i] > a[i + 1]) {
                    op += a[i] - a[i + 1];
                }
            }
            System.out.println(op);
        }
    }
}
