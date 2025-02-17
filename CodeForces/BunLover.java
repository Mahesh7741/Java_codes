import java.util.*;

public class BunLover {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        System.out.println(n * (n + 1) + n + 2);
    }
}
