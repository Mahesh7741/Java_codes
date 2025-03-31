import java.util.*;

public class LongMultiplication {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        String x = sc.next();
        String y = sc.next();

        char[] xArr = x.toCharArray();
        char[] yArr = y.toCharArray();
        boolean f = false;

        for (int i = 0; i < xArr.length; i++) {
            if ((xArr[i] > yArr[i]) == f) {
                char temp = xArr[i];
                xArr[i] = yArr[i];
                yArr[i] = temp;
            }
            f |= (xArr[i] != yArr[i]);
        }

        System.out.println(new String(xArr));
        System.out.println(new String(yArr));
    }
}
