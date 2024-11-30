import java.util.*;
public class ShawarmaTent {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int student = sc.nextInt();
        int sx = sc.nextInt();
        int sy = sc.nextInt();

        int l = 0, r = 0, u = 0, d = 0;

        for (int i = 0; i < student; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x < sx) l++;
            if (x > sx) r++;
            if (y < sy) d++;
            if (y > sy) u++;
        }

        int ans = Math.max(Math.max(l, r), Math.max(u, d));
        if (ans == l) {
            System.out.println(ans);
            System.out.println((sx - 1) + " " + sy);
        } else if (ans == r) {
            System.out.println(ans);
            System.out.println((sx + 1) + " " + sy);
        } else if (ans == d) {
            System.out.println(ans);
            System.out.println(sx + " " + (sy - 1));
        } else {
            System.out.println(ans);
            System.out.println(sx + " " + (sy + 1));
        }
    }
}
