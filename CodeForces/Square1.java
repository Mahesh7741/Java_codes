import java.util.*;

public class Square1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        List<int[]> points = new ArrayList<>();
        for (int i = 0; i < 4; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new int[]{x, y});
        }

        points.sort(Comparator.comparingInt(a -> a[0]));

        int diff = Math.abs(points.get(0)[1] - points.get(1)[1]);
        System.out.println(diff * diff);
    }
}
