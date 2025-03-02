import java.util.*;

public class TheCorridorOrThereAndBackAgain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            TreeMap<Integer, Integer> m = new TreeMap<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (y % 2 == 0) y--;
                m.put(x + y / 2, x);
            }
            System.out.println(m.firstKey());
        }
    }
}
