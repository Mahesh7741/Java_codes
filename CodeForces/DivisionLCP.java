import java.util.*;

public class DivisionLCP {
    static Scanner sc = new Scanner(System.in);

    // Z-Function
    static int[] zFunction(String s) {
        int n = s.length();
        int[] z = new int[n];
        int l = 0, r = 0;
        for (int i = 1; i < n; i++) {
            if (i <= r)
                z[i] = Math.min(r - i + 1, z[i - l]);
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i]))
                z[i]++;
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
        }
        return z;
    }

    static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextInt(); // second k input (duplicate from the problem)
        String s = sc.next();
        int[] z = zFunction(s);

        long low = 1, high = n, ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long cnt = 1;
            for (int i = (int) mid; i < n;) {
                if (z[i] >= mid) {
                    cnt++;
                    i += mid;
                } else i++;
            }

            if (cnt >= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int t = 0; t < TCS; t++) {
            solve();
        }
    }
}
