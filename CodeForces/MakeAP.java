import java.util.*;
public class MakeAP {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if ((b - a) == (c - b))
            System.out.println("YES");
        else if ((2 * b - c) % a == 0 && (2 * b - c) > 0)
            System.out.println("YES");
        else if ((a + c) % (2 * b) == 0)
            System.out.println("YES");
        else if ((2 * b - a) % c == 0 && (2 * b - a) > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
