import java.util.*;

public class SherlockAndHisGirlfriend {

    static boolean[] prime = new boolean[100006]; 

    static void sieve() {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        
        for (int i = 4; i <= 100005; i += 2) {
            prime[i] = false;
        }

        for (int i = 3; i <= 100005; i += 2) {
            if (prime[i]) {
                for (int j = i * 2; j <= 100005; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        sieve();

        long pr = 0, npr = 0;
        for (long i = 2; i <= n + 1; i++) {
            if (prime[(int) i]) {
                pr++;
            } else {
                npr++;
            }
        }

        if (npr == 0) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        for (long i = 2; i <= n + 1; i++) {
            if (prime[(int) i]) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        sc.close();
    }
}
