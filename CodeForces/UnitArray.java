import java.util.Arrays;
import java.util.Scanner;

public class UnitArray {
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long[] arr = new long[(int) n];
        long ans = 0, pos = 0, neg = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            if (arr[i] == -1) {
                neg++;
            } else {
                pos++;
            }
        }

        Arrays.sort(arr);

        while (!((pos - neg) >= 0 && neg % 2 == 0)) {
            neg--;
            pos++;
            ans++;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
