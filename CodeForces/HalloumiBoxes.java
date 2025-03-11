import java.util.*;

public class HalloumiBoxes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] v = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }

            if (isSorted(v)) {
                System.out.println("YES");
            } else if (n > 1 && k < 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    static boolean isSorted(int[] v) {
        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
