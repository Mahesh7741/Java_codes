import java.util.Scanner;

public class GoldRush {
    public static boolean check(int n, int m) {
        if (n == m) return true;
        if (n % 3 != 0 || n < m) return false;
        return check(n / 3, m) || check(2 * n / 3, m);
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (check(n, m)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0) solve(sc);
        sc.close();
    }
}
