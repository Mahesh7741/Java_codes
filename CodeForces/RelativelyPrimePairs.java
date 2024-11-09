import java.util.Scanner;
import java.util.Arrays;

public class RelativelyPrimePairs {
    static long ls, r;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ls = sc.nextLong();
        r = sc.nextLong();

        System.out.println("YES");

        while (ls < r) {
            System.out.println(ls + " " + (ls + 1));
            ls += 2;
        }
    }
}
