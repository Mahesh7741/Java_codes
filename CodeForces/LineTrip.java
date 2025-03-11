import java.util.*;
public class LineTrip {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; ++i) {
                v[i] = sc.nextInt();
            }

            Arrays.sort(v);
            int mx = 0;
            for (int i = 1; i < n; ++i) {
                int dis = v[i] - v[i - 1];
                mx = Math.max(mx, dis);
            }

            int ans = Math.max(Math.max(mx, 2 * (x - v[n - 1])), v[0]);
            System.out.println(ans);
        }
    }
}
