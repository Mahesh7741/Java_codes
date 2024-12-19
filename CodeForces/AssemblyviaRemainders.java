import java.util.*;

public class AssemblyviaRemainders {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();

        int[] rem = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            rem[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        ans[0] = 1000;

        for (int i = 0; i < n - 1; i++) {
            ans[i + 1] = ans[i] + rem[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
