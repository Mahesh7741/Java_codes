import java.util.*;

public class Football1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

        if (n == 1) {
            if (a == b) {
                System.out.println(1);
                System.out.println(a + ":" + b);
                return;
            } else {
                System.out.println(0);
                System.out.println(a + ":" + b);
            }
        } else if (n == a + b) {
            System.out.println(0);
            for (int i = 1; i <= a; ++i) System.out.println("1:0");
            for (int i = 1; i <= b; ++i) System.out.println("0:1");
        } else if (n < a + b) {
            System.out.println(0);
            if (n <= b) {
                int ct = 0;
                boolean zero = true;
                if (a != 0) {
                    System.out.println(a + ":0");
                    zero = false;
                    ct++;
                }
                for (int i = ct + 1; i < n; ++i) {
                    System.out.println("0:1");
                    ct++;
                }
                System.out.println("0:" + (zero ? b - ct : b - ct + 1));
            } else if (n <= a) {
                int ct = 0;
                boolean zero = true;
                if (b != 0) {
                    System.out.println("0:" + b);
                    ct++;
                    zero = false;
                }
                for (int i = ct + 1; i < n; ++i) {
                    System.out.println("1:0");
                    ct++;
                }
                System.out.println((zero ? a - ct : a - ct + 1) + ":0");
            } else {
                int ct = 0;
                for (int i = 1; i <= a; ++i) System.out.println("1:0");
                for (int i = 1; i < n - a; ++i) {
                    System.out.println("0:1");
                    ct++;
                }
                System.out.println("0:" + (b - ct));
            }
        } else {
            System.out.println(n - a - b);
            for (int i = 1; i <= n - a - b; ++i) System.out.println("0:0");
            for (int i = 1; i <= a; ++i) System.out.println("1:0");
            for (int i = 1; i <= b; ++i) System.out.println("0:1");
        }
    }
}
