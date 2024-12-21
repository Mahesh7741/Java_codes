import java.util.*;

public class Upscaling {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();

        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                System.out.print((i / 2 + j / 2) % 2 == 1 ? '.' : '#');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
