import java.util.Arrays;
import java.util.Scanner;

public class EhabAndSubtraction {

    public static void zero(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(a[0]);
            zero(k - 1);
            sc.close();
            return;
        }

        Arrays.sort(a);

        int loop = 0;
        int poop = 0;

        for (int i = 0; i < n - 1; i++) {
            if (poop == 0 && a[i] != 0) {
                System.out.println(a[i]);
                poop++;
                if (poop == k) {
                    break;
                }
            }
            if (poop > 0) {
                if (a[i + 1] > a[i]) {
                    System.out.println(Math.abs(a[i + 1] - a[i]));
                    loop++;
                }
            }
            if ((loop + poop) == k) {
                break;
            }
        }

        zero(k - (loop + poop));

        sc.close();
    }
}
