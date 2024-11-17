import java.util.*;

public class Twice {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        Map<Long, Integer> a = new HashMap<>(); 
        for (long i = 0; i < n; i++) { 
            long val = sc.nextLong();
            a.put(val, a.getOrDefault(val, 0) + 1); 
        }

        int cnt = 0;
        for (Map.Entry<Long, Integer> e : a.entrySet()) {
            cnt += e.getValue() / 2; 
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        long t = sc.nextLong();
        while (t-- > 0) {
            solve();
        }
    }
}
