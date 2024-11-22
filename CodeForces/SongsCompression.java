import java.util.*;

public class SongsCompression {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Pair[] a = new Pair[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[i] = new Pair(x, y);
            sum += x;
        }

        Arrays.sort(a, (p1, p2) -> Math.abs(p2.x - p2.y) - Math.abs(p1.x - p1.y));

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (sum <= m) {
                break;
            }

            sum -= a[i].x;
            sum += a[i].y;
            ans++;
        }

        System.out.println(sum > m ? -1 : ans);
    }

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
