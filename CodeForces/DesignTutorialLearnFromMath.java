import java.util.*;

public class DesignTutorialLearnFromMath {
    static final int MAXN = 1000000;
    static boolean[] isPrime = new boolean[MAXN];
    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAXN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAXN; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    static void solve() {
        sieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 4; 2 * i <= n; i += 2) {
            if (!isPrime[i] && !isPrime[n - i]) {
                System.out.println(i + " " + (n - i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
