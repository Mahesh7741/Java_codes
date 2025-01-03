import java.util.*;
public class Program_name {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[] result = new char[m];
        Arrays.fill(result, 'B');

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int pos1 = t - 1;
            int pos2 = m - t;

            if (result[pos1] == 'B') {
                result[pos1] = 'A';
            } else {
                result[pos2] = 'A';
            }
        }

        System.out.println(new String(result));
    }
}
