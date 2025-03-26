import java.util.*;

public class FindTheDifferentOnes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int[] v = new int[n];
        int[] next = new int[n];
        Arrays.fill(next, -1);

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (v[i] == v[i - 1]) {
                next[i] = next[i - 1];
            } else {
                next[i] = i - 1;
            }
        }

        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;

            if (next[r] < l) {
                sb.append("-1 -1\n");
            } else {
                sb.append((next[r] + 1) + " " + (r + 1) + "\n");
            }
        }
        System.out.print(sb);
    }
}
