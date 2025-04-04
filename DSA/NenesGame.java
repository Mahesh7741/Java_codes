import java.util.*;

public class NenesGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] kick = new int[k];
        int[] player = new int[q];

        for (int i = 0; i < k; i++) {
            kick[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            player[i] = sc.nextInt();
        }

        for (int x : player) {
            System.out.print(Math.min(kick[0] - 1, x) + " ");
        }
        System.out.println();
    }
}
