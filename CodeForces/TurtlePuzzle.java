import java.util.*;

public class TurtlePuzzle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum += Math.abs(x);
        }

        System.out.println(sum);
    }
}
