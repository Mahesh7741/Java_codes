import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int loc = 1;
        long ans = 0;

        for (int i = 0; i < m; i++) {
            int now = sc.nextInt();

            if (now >= loc) {
                ans += now - loc;
            } else {
                ans += n - (loc - now);
            }
            loc = now;
        }

        System.out.println(ans);
    }
}
