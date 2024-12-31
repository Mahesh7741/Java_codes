import java.util.*;

public class WeNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            long n = sc.nextLong();
            long xOR = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                xOR = xOR ^ a;
            }

            if (xOR == 0) {
                System.out.println(0);
            } else if (n % 2 == 1) {			
                System.out.println(xOR);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
