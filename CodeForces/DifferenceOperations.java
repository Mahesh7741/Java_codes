import java.util.Scanner;

public class DifferenceOperations {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        boolean isPoss = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] % arr[0] != 0) {
                isPoss = false;
                break;
            }
        }

        if (isPoss) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
