import java.util.*;

public class LCMProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        while (TC-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (2 * l > r) {
                System.out.println("-1 -1");
            } else {
                System.out.println(l + " " + (2 * l));
            }
        }

        sc.close();
    }
}
