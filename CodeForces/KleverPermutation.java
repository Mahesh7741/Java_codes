import java.util.*;

public class KleverPermutation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] v = new int[n];
        int a = 1, b = n;

        for (int p = 0; p < k; p++) {
            for (int q = p; q < n; q += k) {
                if (p % 2 == 1) {
                    v[q] = b--;
                } else {
                    v[q] = a++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
