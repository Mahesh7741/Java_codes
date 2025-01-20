import java.util.*;

public class GravityFlip {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long[] arr = new long[(int) n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        for (long ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solve();
    }
}
