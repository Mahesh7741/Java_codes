import java.util.*;

public class TwoFriends {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int fnd = i + 1;
            int bst = v[i];
            if (v[bst - 1] == fnd) {
                System.out.println(2);
                return;
            }
        }

        System.out.println(3);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }
}
