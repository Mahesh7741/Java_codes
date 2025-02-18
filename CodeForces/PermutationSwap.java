import java.util.Scanner;

public class PermutationSwap {

    public static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long g = 0;

            for (long p = 1; p <= n; p++) {
                long x = sc.nextLong();
                long diff = p - x;
                diff = (diff > 0) ? diff : -diff;
                g = gcd(g, diff);
            }

            System.out.println(g);
        }

        sc.close();
    }
}
