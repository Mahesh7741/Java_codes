import java.util.*;
public class KindAnton {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            int one = n, negOne = n;

            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    one = i;
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[i] == -1) {
                    negOne = i;
                    break;
                }
            }

            boolean flag = false;
            for (int i = 0; i <= one && i < n; i++) {
                if (a[i] < b[i]) {
                    flag = true;
                    break;
                }
            }

            for (int i = 0; i <= negOne && i < n; i++) {
                if (a[i] > b[i]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
