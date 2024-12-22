import java.util.*;

public class ExcitingBets {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        long diff = b - a;

        if (a == b) {
            System.out.println("0 0");
        } else {
            System.out.println(diff + " " + Math.min(a % diff, diff - a % diff));
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
