import java.util.*;
public class Worms {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = 1;
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            arr[i] = (i == 0) ? temp : arr[i - 1] + temp;
        }

        int k = sc.nextInt();
        while (k-- > 0) {
            long q = sc.nextLong();
            int upperBound = getUpperBound(arr, n, q);
            System.out.println(upperBound + 1);
        }
    }

    public static int getUpperBound(long[] arr, int n, long x) {
        int low = 0, high = n - 1;
        int UB = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                UB = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return UB;
    }
}
