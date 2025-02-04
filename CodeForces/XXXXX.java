import java.util.*;

public class XXXXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        while (TC-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int sum = 0;
            Set<Integer> st = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                if (k % x != 0) {
                    st.add(i);
                    st.add(n - i - 1);
                }
                sum += k;
            }

            if (sum % x != 0) {
                System.out.println(n);
            } else if (st.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(Collections.max(st));
            }
        }

        sc.close();
    }
}
