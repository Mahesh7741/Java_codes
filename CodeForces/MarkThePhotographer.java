import java.util.*;

public class MarkThePhotographer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] v = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            v[i] = sc.nextInt();
        }

        Arrays.sort(v);

        boolean hasTallHeight = true;
        for (int i = 0; i < n; i++) {
            if (v[n + i] - v[i] < x) {
                hasTallHeight = false;
                break;
            }
        }

        if (hasTallHeight) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
