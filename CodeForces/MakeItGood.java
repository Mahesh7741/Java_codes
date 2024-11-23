import java.util.*;

public class MakeItGood {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int count = n - 1;
            while (count > 0 && a[count - 1] >= a[count]) {
                count--;
            }
            while (count > 0 && a[count - 1] <= a[count]) {
                count--;
            }

            System.out.println(count);
        }
    }
}
