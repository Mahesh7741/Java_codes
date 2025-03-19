import java.util.*;

public class CanISquare {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static boolean isSquare(long num) {
        long x = (long) Math.sqrt(num);
        return x * x == num;
    }

    static void solve() {
        int n = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < n; ++i) {
            sum += sc.nextInt();
        }

        if (isSquare(sum))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
