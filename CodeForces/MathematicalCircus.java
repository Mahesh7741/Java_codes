import java.util.*;
public class MathematicalCircus {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt(), k = sc.nextInt();
        if (k % 4 == 0) {
            System.out.println("NO");
        } else if (k % 4 == 2) {
            System.out.println("YES");
            for (int i = 1; i <= n; i += 2) {
                if ((i + 1) % 4 != 0)
                    System.out.println((i + 1) + " " + i);
                else
                    System.out.println(i + " " + (i + 1));
            }
        } else {
            System.out.println("YES");
            for (int i = 1; i <= n; i += 2)
                System.out.println(i + " " + (i + 1));
        }
    }
}
