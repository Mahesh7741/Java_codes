import java.util.*;

public class ChooseTheDifferentOnes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        int ct1 = 0, ct2 = 0;
        for (int x : a) {
            if (x <= k) {
                ct1++;
                ans.add(x);
            }
        }
        for (int x : b) {
            if (x <= k) {
                ct2++;
                ans.add(x);
            }
        }

        if (ans.size() == k && ct1 >= k / 2 && ct2 >= k / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
