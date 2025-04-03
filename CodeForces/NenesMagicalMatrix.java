import java.util.*;

public class NenesMagicalMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long sum = 0;

        for (int i = 1; i <= n; ++i) {
            sum += i * (2 * i - 1);
        }

        System.out.println(sum + " " + (2 * n));

        for (int i = (int) n; i >= 1; --i) {
            System.out.print(1 + " " + i + " ");
            for (int j = 1; j <= n; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();

            System.out.print(2 + " " + i + " ");
            for (int j = 1; j <= n; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
