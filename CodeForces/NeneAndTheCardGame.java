import java.util.*;

public class NeneAndTheCardGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
        }

        int count = 0;
        for (int val : freqMap.values()) {
            if (val == 2) count++;
        }

        System.out.println(count);
    }
}
