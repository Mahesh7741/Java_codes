import java.util.*;

public class TPrimes {
    public static void main(String[] args) {
        new TPrimes().solve();
    }

    void solve() {
        long N = (long) 1e6;
        boolean[] prime = new boolean[(int) (N + 1)];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (long i = 2; i * i <= N; ++i) {
            if (prime[(int) i]) {
                for (long j = i * i; j <= N; j += i) {
                    prime[(int) j] = false;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n-- > 0) {
            long x = sc.nextLong();
            long r = (long) Math.sqrt(x);
            if (r * r != x) {
                System.out.println("NO");
            } else if (prime[(int) r]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
