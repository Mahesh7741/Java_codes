import java.util.*;

public class TrainingBeforeTheOlympiad {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        long[] v = new long[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        long odd = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += v[i];
            if (v[i] % 2 == 1) {
                odd++;
            }
            if (i == 0) {
                System.out.print(sum + " ");
            } else {
                System.out.print((sum - (odd / 3) - (odd % 3 == 1 ? 1 : 0)) + " ");
            }
        }
        System.out.println();
    }
}
