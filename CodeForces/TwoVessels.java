import java.util.*;
public class TwoVessels {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int mn = Math.min(a, b);
            int mx = Math.max(a, b);
            int ct = 0;

            while (mn < mx) {
                mn += c;
                mx -= c;
                ct++;
            }
            System.out.println(ct);
        }
    }
}
