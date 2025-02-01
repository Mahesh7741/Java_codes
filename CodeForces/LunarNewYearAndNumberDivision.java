import java.util.*;

public class LunarNewYearAndNumberDivision {
    
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        Arrays.sort(v);
        long ans = 0;

        for (int i = 0; i < n / 2; i++) {
            int sum = v[i] + v[n - i - 1];
            ans += (long) sum * sum;
        }

        System.out.println(ans);
        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
