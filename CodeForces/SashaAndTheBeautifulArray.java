import java.util.*;

public class SashaAndTheBeautifulArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        List<Long> v = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            v.add(sc.nextLong());
        }
        
        Collections.sort(v);
        System.out.println(v.get(n - 1) - v.get(0));
    }
}
