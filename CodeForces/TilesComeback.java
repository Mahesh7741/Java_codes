import java.util.*;

public class TilesComeback {
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
        int[] v = new int[n];

        for (int i = 0; i < n; i++)
            v[i] = sc.nextInt();

        if (v[0] == v[n - 1]) {
            long count = Arrays.stream(v).filter(num -> num == v[0]).count();
            if (count < k)
                System.out.println("NO");
            else
                System.out.println("YES");
        } else {
            int ctx = 0, cty = 0, x = n, y = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (v[i] == v[n - 1])
                    cty++;
                if (cty == k) {
                    y = i;
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                if (v[i] == v[0])
                    ctx++;
                if (ctx == k) {
                    x = i;
                    break;
                }
            }

            if (x < y)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
