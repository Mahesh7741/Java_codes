import java.util.*;

public class MakeEqualAgain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        long[] v = new long[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        int i = 0, j = n - 1, left = 0, right = 0;

        while (i < n && v[i] == v[0]) {
            i++;
            left++;
        }

        while (j >= 0 && v[j] == v[n - 1]) {
            j--;
            right++;
        }

        if (v[0] == v[n - 1]) {
            System.out.println(Math.max(0, n - left - right));
        } else {
            System.out.println(Math.min(n - left, n - right));
        }
    }
}
