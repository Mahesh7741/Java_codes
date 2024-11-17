import java.util.*;

public class NatlanExploring {
    static final int MAX_A = 1_000_001;
    static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] spf = new int[MAX_A];
        for (int i = 0; i < MAX_A; i++) spf[i] = i;
        for (int i = 2; i * i < MAX_A; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < MAX_A; j += i) {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }
        long[] sumM = new long[MAX_A];
        long answer = 0;

        for (int i = 0; i < n; i++) {
            long dp = 0;

            if (i == 0) {
                dp = 1; // Starting city
            } else {
                // Find prime factors of a[i]
                List<Integer> factors = new ArrayList<>();
                int x = a[i];
                while (x > 1) {
                    int p = spf[x];
                    factors.add(p);
                    while (x % p == 0) x /= p;
                }

                int k = factors.size();
                if (k > 0) {
                    long s = 0;
                    for (int mask = 1; mask < (1 << k); mask++) {
                        int m = 1, cnt = 0;
                        for (int j = 0; j < k; j++) {
                            if ((mask & (1 << j)) != 0) {
                                m *= factors.get(j);
                                cnt++;
                            }
                        }
                        if (cnt % 2 == 1) {
                            s = (s + sumM[m]) % MOD;
                        } else {
                            s = (s - sumM[m] + MOD) % MOD;
                        }
                    }
                    dp = s;
                }
            }

            if (i == n - 1) {
                answer = dp;
            }
            List<Integer> factors = new ArrayList<>();
            int x = a[i];
            while (x > 1) {
                int p = spf[x];
                factors.add(p);
                while (x % p == 0) x /= p;
            }

            int k = factors.size();
            for (int mask = 1; mask < (1 << k); mask++) {
                int m = 1;
                for (int j = 0; j < k; j++) {
                    if ((mask & (1 << j)) != 0) {
                        m *= factors.get(j);
                    }
                }
                sumM[m] = (sumM[m] + dp) % MOD;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
