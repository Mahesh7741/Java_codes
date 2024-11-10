import java.util.Scanner;

public class LazySecurityGuard {
    
    public static boolean isPerfect(long N) {
        double sqrtN = Math.sqrt(N);
        return sqrtN == Math.floor(sqrtN);
    }

    public static long findSqrt(long n) {
        while (n > 0) {
            if (isPerfect(n)) {
                return n;
            }
            n--;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long x = (long) Math.sqrt(findSqrt(n));
        long ans = x * 4;
        long extra = n - (x * x);

        if (extra > 0) {
            if (extra <= x) {
                ans += 2;
            } else {
                ans += 4;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
