import java.util.*;
public class AlmostTernaryMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x1 = i / 2, x2 = j / 2;
                int y1 = (x1 + x2) & 1, y2 = ((i & 1) + (j & 1)) & 1;

                System.out.print((y1 ^ y2) + " ");
            }
            System.out.println();
        }
    }
}
