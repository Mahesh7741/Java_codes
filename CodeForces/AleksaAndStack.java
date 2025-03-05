import java.util.*;
public class AleksaAndStack {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- >0) solve();
    }

    static void solve() {
        int n = sc.nextInt();
        int s = 0, in = 1;
        for (int i = 0; i < n; ++i) {
            System.out.print(s + in + " ");
            s += 2;
        }
        System.out.println();
    }
}
