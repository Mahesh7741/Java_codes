import java.util.*;

public class BerSUBall {

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int ct = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int dif = Math.abs(a[i] - b[j]);
                if (dif < 2) {
                    b[j] = 1000;
                    ct++;
                    break;
                }
            }
        }

        System.out.println(ct);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = 1;

        while (TC-- > 0) {
            solve();
        }
    }
}
