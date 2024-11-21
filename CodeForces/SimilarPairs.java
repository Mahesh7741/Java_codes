import java.util.*;
public class SimilarPairs {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int even = 0, odd = 0, diff = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            Arrays.sort(a);
            for (int i = 1; i < n; i++) {
                if (Math.abs(a[i] - a[i - 1]) == 1) {
                    diff++;
                }
            }

            if (even % 2 == 0 && odd % 2 == 0) {
                System.out.println("YES");
            } else if (even % 2 == 1 && odd % 2 == 1) {
                if (diff >= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
