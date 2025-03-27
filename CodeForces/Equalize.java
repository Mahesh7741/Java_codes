	import java.util.*;

public class Equalize {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        TreeSet<Integer> s1 = new TreeSet<>();
        TreeSet<Integer> s2 = new TreeSet<>();

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            s1.add(x);
            s2.add(x + n);
        }

        int ans = 0, ct = 0;

        for (int e : s1) {
            ct++;
            while (!s2.isEmpty() && s2.first() <= e) {
                s2.pollFirst(); 
                ct--;
            }
            ans = Math.max(ans, ct);
        }
        System.out.println(ans);
    }
}
