import java.util.*;

public class DivisibleArray {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int sum = 0;

        for (int i = 1; i <= n; ++i) {
            a[i] = i;
            sum += i;
        }
        System.err.println(sum + " " + n);

        if (sum % n != 0) {
            int r = sum % n;
            a[r] = a[r] + r;
        }

        for (int i = 1; i <= n; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }
}
