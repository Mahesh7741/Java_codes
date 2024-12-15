import java.util.*;
public class Year2023 {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();

        long[] arr = new long[(int) n];
        long prod = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            prod *= arr[i];
        }

        if (2023 % prod == 0) {
            System.out.println("Yes");
            System.out.print(2023 / prod + " ");
            for (int i = 0; i < k - 1; i++) {
                System.out.print(1 + " ");
            }
            System.out.println();
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
