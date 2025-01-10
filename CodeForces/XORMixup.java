import java.util.*;

public class XORMixup {
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
        long ans = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            long xorEle = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    xorEle = xorEle ^ arr[j];
                }
            }

            if (xorEle == arr[i]) {
                ans = xorEle;
            }
        }

        System.out.println(ans);
    }
}
