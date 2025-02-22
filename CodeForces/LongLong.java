import java.util.*;

public class LongLong {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        int n = sc.nextInt();
        List<Long> v = new ArrayList<>();
        
		
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (x != 0) v.add(x);
        }

        long sum = 0, ct = 0;
        boolean flag = true;

        for (long x : v) {
            if (x < 0 && flag) {
                ct++;
                flag = false;
            } else if (x > 0) {
                flag = true;
            }
            sum += Math.abs(x);
        }

        System.out.println(sum + " " + ct);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }
}
