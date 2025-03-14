import java.util.*;

public class DistinctButtons {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        Set<Character> st = new HashSet<>();
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();

            if (p > 0) st.add('r');
            else if (p < 0) st.add('l');

            if (q > 0) st.add('u');
            else if (q < 0) st.add('d');

            if (st.size() == 4) {
                possible = false;
            }
        }

        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
