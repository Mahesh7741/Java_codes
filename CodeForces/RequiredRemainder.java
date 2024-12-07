import java.util.Scanner;

public class RequiredRemainder {
    public static void solve(Scanner sc) {
        long x = sc.nextLong();
        long y = sc.nextLong();
        long n = sc.nextLong();

        if (n - n % x + y <= n) {
            System.out.println(n - n % x + y);
        } else {
            System.out.println(n - n % x - (x - y));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
