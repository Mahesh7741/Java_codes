import java.util.*;

public class Coins {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        if ((n % 2 == 0) || (n % 2 == 1 && k % 2 == 1))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
