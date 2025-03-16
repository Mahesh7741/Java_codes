import java.util.*;

public class PreparingForTheContest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> v = new ArrayList<>();

        for (int i = n - 1; i >= 0; --i) {
            v.add(i + 1);
        }
        Collections.sort(v.subList(0, k + 1));
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
