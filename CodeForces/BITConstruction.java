	import java.util.*;

public class BITConstruction {
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

        if (n == 1) {
            System.out.println(k);
            return;
        }
        if (k == 1) {
            for (int i = 0; i < n - 1; ++i)
                System.out.print("0 ");
            System.out.println(1);
            return;
        }

        int x = (int) (Math.log(k) / Math.log(2));
        x--;
        int r = (1 << (x + 1)) - 1;

        for (int i = 0; i < n - 2; ++i)
            System.out.print("0 ");

        System.out.println(r + " " + (k - r));
    }
}
