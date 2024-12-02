import java.util.*;

public class CyclicPermutations {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long mod = 1000000007L;
        long n = sc.nextLong();

        long power = 1;
        for (int i = 1; i < n; i++) {
            power = (power * 2) % mod;
        }

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = (fact * i) % mod;
        }

        long ans = (fact - power + mod) % mod;
        System.out.println(ans);
    }
}
