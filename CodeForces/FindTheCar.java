import java.util.*;

public class FindTheCar {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        long[] a = new long[k + 1];
        long[] b = new long[k + 1];
        a[0] = b[0] = 0;

        for (int i = 1; i <= k; i++) a[i] = sc.nextLong();
        for (int i = 1; i <= k; i++) b[i] = sc.nextLong();

        while (q-- > 0) {
            long d = sc.nextLong();
            int ind = Arrays.binarySearch(a, d);
            if (ind >= 0) {
                System.out.print(b[ind] + " ");
            } else {
                ind = -ind - 1;
                long dist = a[ind] - a[ind - 1];
                long time = b[ind] - b[ind - 1];
                long x = d - a[ind - 1];
                long res = (x * time) / dist + b[ind - 1];
                System.out.print(res + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int t = 0; t < TCS; t++) {
            solve();
        }
    }
}
