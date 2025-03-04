import java.util.*;
public class GoalsOfVictory {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- >0) solve();
    }

    static void solve() {
        int n = sc.nextInt(), total = 0;
        for (int i = 1; i < n; ++i) total += sc.nextInt();
        System.out.println(-total);
    }
}
