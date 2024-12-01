import java.util.*;
public class ElementExtermination {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            if (a[0] < a[n - 1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
