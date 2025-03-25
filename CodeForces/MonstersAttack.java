import java.util.*;

public class MonstersAttack {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int x = Math.abs(sc.nextInt());
            b[x] += a[i];
        }

        int r = 0;
        for (int i = 1; i <= n; i++) {
            r += k;
            if (r < b[i]) {
                System.out.println("NO");
                return;
            }
            r -= b[i];
        }
        System.out.println("YES");
    }
}
