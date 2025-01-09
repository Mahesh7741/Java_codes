import java.util.*;
public class Maxmina {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();

        boolean hasOne = false;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp == 1) {
                hasOne = true;
            }
        }

        if (hasOne) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
