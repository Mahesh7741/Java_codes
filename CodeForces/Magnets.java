import java.util.*;

public class Magnets {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int) n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long maxGrp = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                maxGrp++;
            }
        }

        System.out.println(maxGrp);
    }

    public static void main(String[] args) {
        solve();
    }
}
