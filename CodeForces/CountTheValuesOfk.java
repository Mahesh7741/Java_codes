import java.util.*;

public class CountTheValuesOfk {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long l = sc.nextLong();
        Set<Long> st = new HashSet<>();

        for (long x = 0; power(a, x) <= l; x++) {
            for (long y = 0; power(b, y) <= l; y++) {
                long res = power(a, x) * power(b, y);
                if (l % res == 0)
                    st.add(l / res);
            }
        }
        System.out.println(st.size());
    }

    static long power(long base, long exp) {
        long ans = 1, mod = Long.MAX_VALUE;
        while (exp > 0) {
            if ((exp & 1) == 1) ans = (ans * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return ans;
    }
}
