import java.util.*;
public class BlackboardList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();
        long maxEle = Long.MIN_VALUE;
        long minEle = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            maxEle = Math.max(maxEle, temp);
            minEle = Math.min(minEle, temp);
        }

        if (minEle < 0) {
            System.out.println(minEle);
        } else {
            System.out.println(maxEle);
        }
    }
}
