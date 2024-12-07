import java.util.Scanner;

public class MochaAndMath {
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long[] arr = new long[(int) n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long ans = arr[0];

        for (int i = 1; i < n; i++) {
            ans = (ans & arr[i]);
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
