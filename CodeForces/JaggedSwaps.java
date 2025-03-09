import java.util.*;
public class JaggedSwaps {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        List<Long> v = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            v.add(sc.nextLong());

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < n - 1; ++i) {
                if (v.get(i) > v.get(i - 1) && v.get(i) > v.get(i + 1)) {
                    flag = true;
                    Collections.swap(v, i, i + 1);
                }
            }
        }

        if (isSorted(v))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isSorted(List<Long> v) {
        for (int i = 1; i < v.size(); i++) {
            if (v.get(i) < v.get(i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}
