import java.util.*;
public class DeadlyLaser {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt(), m = sc.nextInt();
        int s1 = sc.nextInt(), s2 = sc.nextInt(), d = sc.nextInt();
        boolean pass = true;

        if (s1 + d >= n && s2 + d >= m) pass = false;
        else if (s1 - d <= 1 && s2 - d <= 1) pass = false;
        else if (s1 + d >= n && s1 - d <= 1) pass = false;
        else if (s2 + d >= m && s2 - d <= 1) pass = false;

        System.out.println(pass ? (n + m - 2) : "-1");
    }
}
