import java.util.*;

public class OneAndTwo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0)
            solve();
    }

    static void solve() {
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        int ct = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            v.add(x);
            if (x == 2)
                ct++;
        }

        if (ct == 0) {
            System.out.println(1);
        } else if (ct % 2 == 1) {
            System.out.println(-1);
        } else {
            ct /= 2;
            int x = 0;

            for (int i = 0; i < n; i++) {
                if (v.get(i) == 2)
                    x++;
                if (x == ct) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
    }
}
