import java.util.*;

public class MathematicalProblem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println("196" + "0".repeat(n - 3));

        for (int x = 0; x * 2 + 3 <= n; ++x) {
            System.out.println("1" + "0".repeat(x) + "6" + "0".repeat(x) + "9" + "0".repeat(n - (x * 2 + 3)));
            System.out.println("9" + "0".repeat(x) + "6" + "0".repeat(x) + "1" + "0".repeat(n - (x * 2 + 3)));
        }
    }
}
