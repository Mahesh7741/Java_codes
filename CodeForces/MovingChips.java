import java.util.*;

public class MovingChips {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        // Remove trailing zeros
        while (!v.isEmpty() && v.get(v.size() - 1) == 0) {
            v.remove(v.size() - 1);
        }

        int count = 0;
        boolean foundOne = false;

        for (int num : v) {
            if (num == 0 && foundOne) {
                count++;
            }
            if (num == 1) {
                foundOne = true;
            }
        }

        System.out.println(count);
    }
}
