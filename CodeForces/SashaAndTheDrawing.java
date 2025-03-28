import java.util.*;

public class SashaAndTheDrawing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong(), k = sc.nextLong();
        long x = 2 * (2 * n - 2);

        if (k <= x) {
            if (k % 2 == 1) k++;
            System.out.println(k / 2);
        } else {
            System.out.println(x / 2 + (k - x));
        }
    }
}
