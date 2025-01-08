import java.util.*;
public class MakeItIncreasing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long minCount = 0;

        for (int i = n - 2; i >= 0; i--) {
            while (arr[i] >= arr[i + 1] && arr[i] > 0) {
                arr[i] /= 2;
                minCount++;
            }

            if (arr[i] == arr[i + 1]) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(minCount);
    }
}
