import java.util.*;

public class Zigzags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long result = 0;
            int[] freq = new int[n + 1];

            for (int k = n - 2; k >= 1; k--) {
                freq[a[k + 1]]++;

                long countPairs = 0;
                for (int j = k - 1; j >= 0; j--) {
                    if (a[j] == a[k]) {
                        result += countPairs;
                    }
                    countPairs += freq[a[j]];
                }
            }

            System.out.println(result);
        }
        sc.close();
    }
}
