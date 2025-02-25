import java.util.*;

public class ParitySort {
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
        int[] v2 = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
            v2[i] = v[i];
        }

        Arrays.sort(v2);
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            if ((v[i] % 2 == 0 && v2[i] % 2 != 0) || (v[i] % 2 != 0 && v2[i] % 2 == 0)) {
                possible = false;
                break;
            }
        }

        System.out.println(possible ? "YES" : "NO");
    }
}
