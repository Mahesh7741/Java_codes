import java.util.*;
public class GrabTheCandies	 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long evenSum = 0, oddSum = 0;
            for (int i = 0; i < n; i++) {
                long t = sc.nextLong();
                if (t % 2 == 0) {
                    evenSum += t;
                } else {
                    oddSum += t;
                }
            }
            if (evenSum > oddSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
