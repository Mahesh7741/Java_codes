import java.util.*;

public class ForbiddenInteger {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long x = sc.nextLong();

        if (x != 1) {
            System.out.println("YES");
            System.out.println(n);

            for (int i = 0; i < n; i++) {
                System.out.print(1 + " ");
            }
            System.out.println();
        } else {
            if (k >= 2 && n % 2 == 0) {
                System.out.println("YES");
                System.out.println(n / 2);

                for (int i = 0; i < n / 2; i++) {
                    System.out.print(2 + " ");
                }
                System.out.println();
            } else if (k >= 3) {
                System.out.println("YES");
                System.out.println(n / 2);
                System.out.print(3 + " ");
                for (int i = 1; i < n / 2; i++) {
                    System.out.print(2 + " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
