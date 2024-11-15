import java.util.*;

public class Trace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int rr = 0;

        for (int i = n - 1, toggle = 1; i >= 0; --i, toggle = -toggle) {
            rr += a[i] * a[i] * toggle;
        }

        double pi = Math.PI;
        System.out.printf("%.10f%n", pi * rr);
    }
}
