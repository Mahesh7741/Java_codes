import java.util.*;

public class RomanticGlasses {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        Set<Long> st = new HashSet<>();
        st.add(0L);
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                v[i] = -v[i];
            }
            sum += v[i];

            if (st.contains(sum)) {
                System.out.println("YES");
                return;
            }
            st.add(sum);
        }
        System.out.println("NO");
    }
}
