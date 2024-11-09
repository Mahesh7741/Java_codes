import java.util.*;
import java.util.Map.Entry;

public class BusinessmenProblems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            m.put(a, b);
        }

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            m.put(a, Math.max(m.getOrDefault(a, 0), b));
        }

        long ans = 0;
        for (int value : m.values()) {
            ans += value;
        }

        System.out.println(ans);
        sc.close();
    }
}
