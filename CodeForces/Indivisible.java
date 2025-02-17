import java.util.*;

public class Indivisible {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("1");
        } else if (n % 2 != 0) {
            System.out.println("-1");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i += 2) {
                sb.append(i + 1).append(" ").append(i).append(" ");
            }
            System.out.println(sb);
        }
    }
}
