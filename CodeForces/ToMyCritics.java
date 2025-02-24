import java.util.*;

public class ToMyCritics {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b >= 10 || b + c >= 10 || a + c >= 10)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
