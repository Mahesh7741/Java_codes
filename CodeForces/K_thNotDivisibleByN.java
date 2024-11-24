import java.util.*;

public class K_thNotDivisibleByN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testcase = sc.nextInt();
        for (int t = 1; t <= testcase; t++) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long div = k / (n - 1);
            long ex = k % (n - 1);
            long ans = n * div + ex;
            if (ex == 0) {
                ans--;
            }
            System.out.println(ans);
        }
    }
}
