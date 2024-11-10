import java.util.Scanner;

public class NewRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {
            // Read the number of contests
            int n = sc.nextInt();

            // Read the performance ratings for each contest
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Calculate the maximum possible rating after recalculation
            System.out.println(maxRatingAfterSkip(n, a));
        }

        sc.close();
    }

    public static int maxRatingAfterSkip(int n, int[] a) {
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        // Step 1: Compute the prefix array where prefix[i] is the rating if we don't skip any contests up to i
        prefix[0] = 0;  // Initial rating is 0
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                prefix[i] = prefix[i - 1] + 1;
            } else if (a[i] == a[i - 1]) {
                prefix[i] = prefix[i - 1];
            } else {
                prefix[i] = prefix[i - 1] - 1;
            }
        }

        // Step 2: Compute the suffix array where suffix[i] is the rating if we skip all contests from i onward
        suffix[n - 1] = 0;  // Initial rating is 0
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[i + 1]) {
                suffix[i] = suffix[i + 1] - 1;
            } else if (a[i] == a[i + 1]) {
                suffix[i] = suffix[i + 1];
            } else {
                suffix[i] = suffix[i + 1] + 1;
            }
        }

        // Step 3: Find the maximum possible rating by skipping an interval [l, r]
        int maxRating = Integer.MIN_VALUE;
        
        // Try skipping each possible interval [l, r]
        for (int i = 0; i < n - 1; i++) {  // i represents the end of the interval to skip
            maxRating = Math.max(maxRating, prefix[i] + suffix[i + 1]);
        }

        return maxRating;
    }
}
