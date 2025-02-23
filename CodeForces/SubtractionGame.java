import java.util.*;

public class SubtractionGame {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }
}
