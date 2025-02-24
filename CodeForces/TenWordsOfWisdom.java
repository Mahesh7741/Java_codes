import java.util.*;

public class TenWordsOfWisdom {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        TreeMap<Integer, Integer> ans = new TreeMap<>(Collections.reverseOrder());

        for (int i = 1; i <= n; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= 10) {
                ans.put(y, i);
            }
        }

        System.out.println(ans.firstEntry().getValue());
    }
}
