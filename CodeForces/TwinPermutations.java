import java.util.*;

public class TwinPermutations {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ans.add(n + 1 - x);
        }

        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
