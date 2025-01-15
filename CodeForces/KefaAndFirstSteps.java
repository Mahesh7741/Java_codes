import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long[] arr = new long[(int) n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long maxSub = 0, currCount = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] >= arr[i]) {
                currCount++;
            } else {
                maxSub = Math.max(maxSub, currCount);
                currCount = 1;
            }
        }

        maxSub = Math.max(maxSub, currCount);
        System.out.println(maxSub);
    }
}
