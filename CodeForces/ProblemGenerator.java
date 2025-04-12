import java.util.*;

public class ProblemGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] cnt = new int[7];
            String s = sc.next();
            for (int i = 0; i < n; i++) {
                cnt[s.charAt(i) - 'A']++;
            }
            int ans = 0;
            for (int i = 0; i < 7; i++) {
                ans += Math.max(m - cnt[i], 0);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
