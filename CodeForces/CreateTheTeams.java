import java.util.*;
public class CreateTheTeams {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong(), x = sc.nextLong();
        long[] v = new long[(int) n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        Arrays.sort(v);

        int ans = 0, cnt = 1;

        for (int i = (int) n - 1; i >= 0; i--) {
            if (cnt * v[i] >= x) {
                ans++;
                cnt = 0;
            }
            cnt++;
        }

        System.out.println(ans);
    }
}
