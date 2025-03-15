import java.util.*;

public class SwapAndDelete {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        String s = sc.next();
        int n = s.length();
        int[] cnt = new int[2];

        for (int i = 0; i < n; ++i)
            cnt[s.charAt(i) - '0']++;

        for (int i = 0; i < n; ++i) {
            int x = (s.charAt(i) - '0') ^ 1;
            if (cnt[x] == 0) {
                System.out.println(n - i);
                return;
            }
            cnt[x]--;
        }
        System.out.println(0);
    }
}
