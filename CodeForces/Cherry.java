import java.util.Scanner;

public class Cherry {
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        if (n == 2) {
            System.out.println(arr[0] * arr[1]);
        } else {
            long maxi = Long.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                maxi = Math.max(maxi, arr[i] * arr[i - 1]);
            }
            System.out.println(maxi);
        }
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
