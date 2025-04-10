import java.util.*;

public class SerejaAndBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[1001];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[b[i]]++;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            c[b[i]]--;
            if (c[a[i]] == 0) {
                count++;
            }
            c[b[i]]++;
        }

        System.out.println(count);
    }
}
