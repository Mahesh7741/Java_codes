import java.util.*;

public class SequenceGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        long n = sc.nextLong();
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        List<Long> ans = new ArrayList<>();
        ans.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                ans.add(arr[i]);
            } else {
                ans.add(1L);
                ans.add(arr[i]);
            }
        }

        System.out.println(ans.size());
        for (long val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
