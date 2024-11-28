import java.util.*;

public class Servers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] s = new int[n + 1];
        Arrays.fill(s, 0);

        while (q-- > 0) {
            int t = sc.nextInt();
            int k = sc.nextInt();
            int d = sc.nextInt();

            List<Integer> w = new ArrayList<>();

            for (int p = 1; p <= n; p++) {
                if (s[p] < t) {
                    w.add(p);
                }
                if (w.size() >= k) {
                    break;
                }
            }

            if (w.size() < k) {
                System.out.println("-1");
            } else {
                int sum = 0;
                for (int p : w) {
                    sum += p;
                    s[p] = t + d - 1;
                }
                System.out.println(sum);
            }
        }
    }
}
