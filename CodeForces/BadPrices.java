import java.util.*;
public class BadPrices {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int cnt = 0;
            int mn = a[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                if (a[i] > mn) {
                    cnt++;
                }
                mn = Math.min(a[i], mn);
            }

            System.out.println(cnt);
        }
    }
}
