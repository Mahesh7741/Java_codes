import java.util.*;

public class UnfairGame {
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
        int d = sc.nextInt();

        int ans = (a / 2) + (b / 2) + (c / 2) + (d / 2);
        if ((a & 1) == 1 && (b & 1) == 1 && (c & 1) == 1)
            ans++;

        System.out.println(ans);
    }
}
