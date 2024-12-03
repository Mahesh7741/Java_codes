import java.util.*;

public class Candies {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();

        for (int i = 2; i < 30; i++) {
            int pow = (1 << i) - 1;
            if (n % pow == 0) {
                System.out.println(n / pow);
                break;
            }
        }
    }
}
