import java.util.*;

public class JeffAndDigits {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long count5 = 0, count0 = 0;

        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();

            if (t == 5)
                count5++;
            else
                count0++;
        }

        count5 = count5 - (count5 % 9);

        if (count5 == 0 && count0 != 0)
            System.out.println(0);
        else if (count5 != 0 && count0 >= 1) {
            for (int i = 0; i < count5; i++)
                System.out.print(5);
            for (int i = 0; i < count0; i++)
                System.out.print(0);

            System.out.println();
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
