import java.util.*;

public class RemovalOfUnattractivePairs {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        Map<Character, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(c));
        }

        if (maxFreq > n / 2) {
            System.out.println(2 * maxFreq - n);
        } else {
            System.out.println(n % 2);
        }
    }
}
