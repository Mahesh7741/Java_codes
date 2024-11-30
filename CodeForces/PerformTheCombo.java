import java.util.*;
public class PerformTheCombo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[n + 1];
            for (int i = 0; i < m; i++) {
                int y = sc.nextInt();
                freq[0]++;
                freq[y]--;
            }
            for (int i = 1; i < n; i++) {
                freq[i] += freq[i - 1];
            }
            for (int i = 0; i < n; i++) {
                freq[i]++;
            }
            List<Long> ans = new ArrayList<>(Collections.nCopies(26, 0L));
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                ans.set(ch - 'a', ans.get(ch - 'a') + freq[i]);
            }
            for (long val : ans) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
