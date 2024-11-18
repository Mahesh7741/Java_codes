import java.util.*;

public class TernaryLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), c = sc.nextInt();
        int[] ad = new int[20], cd = new int[20];
        int an = 0, cn = 0;

        while (a != 0) {
            ad[an++] = a % 3;
            a /= 3;
        }

        while (c != 0) {
            cd[cn++] = c % 3;
            c /= 3;
        }

        int tor = 0;
        for (int i = Math.max(an, cn) - 1; i >= 0; --i) {
            tor = tor * 3 + (cd[i] + 3 - ad[i]) % 3;
        }
        System.out.println(tor);
    }
}
