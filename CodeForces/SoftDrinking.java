import java.util.*;
public class SoftDrinking {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            solve();
    }

    public static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long l = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long p = sc.nextLong();
        long nl = sc.nextLong();
        long np = sc.nextLong();

        long possToast = (k * l) / nl;
        long limeAvai = (c * d);
        long saltAvai = (p / np);

        System.out.println(Math.min(possToast, Math.min(limeAvai, saltAvai)) / n);
    }
}
