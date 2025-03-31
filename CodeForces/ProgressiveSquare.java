import java.util.*;

public class ProgressiveSquare {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        List<Long> v = new ArrayList<>();
        for (int i = 0; i < n * n; i++) {
            v.add(sc.nextLong());
        }

        Collections.sort(v);
        List<Long> temp = new ArrayList<>();
        temp.add(v.get(0));

        for (int i = 1; i < n; i++) {
            temp.add(temp.get(i - 1) + c);
        }

        for (int i = 0; i < n; i++) {
            long cur = temp.get(i);
            for (int j = 1; j < n; j++) {
                cur += d;
                temp.add(cur);
            }
        }

        Collections.sort(temp);
        System.out.println(v.equals(temp) ? "YES" : "NO");
    }
}
