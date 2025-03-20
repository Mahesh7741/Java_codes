import java.util.*;

public class 2023 {
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
        long prod = 1;

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            prod *= x;
        }

        if (2023 % prod != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.print(2023 / prod + " ");
            for (int i = 0; i < k - 1; ++i) {
                System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}
