import java.util.*;
public class TreasureChest {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long x = sc.nextLong();
        long y = sc.nextLong();
        long k = sc.nextLong();

        if (x >= y)
            System.out.println(x);
        else if (x + k >= y)
            System.out.println(y);
        else
            System.out.println(y + y - x - k);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}
