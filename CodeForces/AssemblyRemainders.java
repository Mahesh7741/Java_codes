import java.util.*;

public class AssemblyRemainders {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int TC = 1; TC <= TCS; ++TC) {
            // System.out.print("Case " + TC + ": ");
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long[] v = new long[(int) n - 1];
        for (int i = 0; i < n - 1; ++i) {
            v[i] = sc.nextLong();
        }

        List<Long> ans = new ArrayList<>();
        ans.add(v[(int)n - 2]);      
        ans.add(1000000000L);         

        for (int i = (int) n - 3; i >= 0; --i) {
            long next = ans.get(ans.size() - 1) - v[i];
            ans.add(next);
        }

        Collections.reverse(ans);

        for (long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
