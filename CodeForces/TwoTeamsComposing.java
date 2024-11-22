import java.util.*;

public class TwoTeamsComposing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            Map<Long, Long> frequencyMap = new HashMap<>();
            Set<Long> uniqueElements = new HashSet<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                frequencyMap.put(a[i], frequencyMap.getOrDefault(a[i], 0L) + 1);
                uniqueElements.add(a[i]);
            }

            long maxFrequency = 0;
            for (long count : frequencyMap.values()) {
                maxFrequency = Math.max(maxFrequency, count);
            }

            long team1 = uniqueElements.size();
            long team2 = maxFrequency;

            if (team1 > team2) {
                System.out.println(team2);
            } else if (team1 < team2) {
                System.out.println(team1);
            } else {
                System.out.println(team1 - 1);
            }
        }
    }
}
