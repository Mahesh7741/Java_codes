import java.util.*;
public class OrdinaryNumbers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            long ans = 0;
            for (long power = 1; power <= n; power = power * 10 + 1) {
                for (long d = 1; d <= 9; d++) {
                    if (power * d <= n) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
