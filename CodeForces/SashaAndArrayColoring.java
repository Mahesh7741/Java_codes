import java.util.*;

public class SashaAndArrayColoring {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        Collections.sort(v);
        int cost = 0;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            cost += v.get(j) - v.get(i);
        }

        System.out.println(cost);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }
}
