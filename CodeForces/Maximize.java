import java.util.*;

public class Maximize {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int TC = 1; TC <= TCS; ++TC) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        System.out.println(n - 1);
    }
}
