import java.util.*;
public class Transfusion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long t = sc.nextLong();
        while (t-- > 0) {
            solve();
        }
        sc.close();
    }
    public static void solve() {
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] v = new long[2];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            v[i % 2] += a[i];
        }
        System.out.println((v[0] % n == 0 && v[1] % n == 0 && v[0] == v[1]) ? "YES" : "NO");
    }
}
