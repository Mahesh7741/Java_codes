import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[1001];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        sc.close();

        Arrays.sort(a, 0, n);

        ArrayList<Long> v = new ArrayList<>();
        int N = n / 2;
        if (n % 2 == 1) {
            N = (n / 2) + 1;
        }

        for (int i = 0; i < N; i++) {
            v.add(a[i]);
            if (i == (n - 1 - i)) continue;
            v.add(a[n - 1 - i]);
        }

        for (long val : v) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
