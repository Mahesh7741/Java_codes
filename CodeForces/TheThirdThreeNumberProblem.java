import java.util.*;
public class TheThirdThreeNumberProblem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();

        if (n % 2 != 0) {
            System.out.println(-1);
        } else {
            System.out.println(0 + " " + 0 + " " + (n / 2));
        }
    }
}
