import java.util.*;

public class BegginerZelda {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        Map<Integer, Integer> degreeMap = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            degreeMap.put(x, degreeMap.getOrDefault(x, 0) + 1);
            degreeMap.put(y, degreeMap.getOrDefault(y, 0) + 1);
        }

        int leafCount = 0;
        for (int degree : degreeMap.values()) {
            if (degree == 1) {
                leafCount++;
            }
        }

        if (leafCount % 2 == 1) {
            leafCount++;
        }

        System.out.println(leafCount / 2);
    }
}
