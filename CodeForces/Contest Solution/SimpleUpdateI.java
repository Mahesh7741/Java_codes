import java.util.*;

public class SimpleUpdateI {

    public static int countOnes(String s, int n, int k) {
        int maxCountOnes = 0;

        // Iterate over all possible valid positions for 'i'
        for (int i = k; i <= n - k; i++) {
            StringBuilder str = new StringBuilder(s);

            // Update the previous k elements (s[i-k+1] to s[i]) to '1'
            for (int j = i - k; j <= i - 1; j++) {
                str.setCharAt(j, '1');
            }

            // Update the next k elements (s[i+1] to s[i+k]) to '0', ensuring we stay in bounds
            for (int l = i; l < Math.min(i + k, n); l++) {
                str.setCharAt(l, '0');
            }

            // Count the number of '1's in the updated string
            int ones = 0;
            for (int m = 0; m < n; m++) {
                if (str.charAt(m) == '1') {
                    ones++;
                }
            }

            // Update maxCountOnes to the maximum count of '1's encountered so far
            maxCountOnes = Math.max(maxCountOnes, ones);
        }

        return maxCountOnes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the string
            int k = sc.nextInt(); // The parameter k
            sc.nextLine(); // Consume the leftover newline
            String s = sc.nextLine(); // The binary string
            int result = countOnes(s, n, k); // Calculate the result
            System.out.println(result); // Output the result
        }
        sc.close();
    }
}
