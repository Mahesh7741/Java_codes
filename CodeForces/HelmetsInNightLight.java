import java.util.*;
public class HelmetsInNightLight {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int TC = 1; TC <= TCS; ++TC) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int p = sc.nextInt();
        List<Pair> v = new ArrayList<>();
        
        for (int i = 0; i < n; i++) v.add(new Pair(sc.nextInt(), 0));
        for (int i = 0; i < n; i++) v.get(i).ff = sc.nextInt();

        v.sort((a, b) -> a.ff == b.ff ? Integer.compare(b.ss, a.ss) : Integer.compare(a.ff, b.ff));

        int rem = n - 1, ans = p;
        for (Pair pair : v) {
            if (pair.ff >= p) break;
            int ct = Math.min(rem, pair.ss);
            ans += ct * pair.ff;
            rem -= ct;
        }
        ans += rem * p;
        System.out.println(ans);
    }
}

class Pair {
    int ff, ss;
    Pair(int ss, int ff) {
        this.ff = ff;
        this.ss = ss;
    }
}
