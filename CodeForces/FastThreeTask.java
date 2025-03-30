import java.util.*;

public class FastThreeTask {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int sum = 0, flag = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 3 == 1) flag = 1;
            sum += x;
        }

        if (sum % 3 == 0)
            System.out.println(0);
        else if (flag == 1)
            System.out.println(1);
        else
            System.out.println(3 - (sum % 3));
    }
}
