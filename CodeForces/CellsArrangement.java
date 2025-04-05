import java.util.*;

public class CellsArrangement {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int TC = 1; TC <= TCS; ++TC) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.println(i + " " + (i == 2 ? i - 1 : i));
        }
        System.out.println();
    }
}
