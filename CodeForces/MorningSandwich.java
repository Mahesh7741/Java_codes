import java.util.*;

public class MorningSandwich {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int b = sc.nextInt();
        int c = sc.nextInt();
        int h = sc.nextInt();

        if (b == c + h)
            System.out.println(b + c + h - 1);
        else if (b > c + h)
            System.out.println(2 * (c + h) + 1);
        else
            System.out.println(2 * b - 1);
    }
}
