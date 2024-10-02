import java.util.Scanner;
public class SimpleUpdateI {
    // Solve for one test case
    public static void solve(Scanner sc) {
        int n = sc.nextInt(); // Length of the string
        int k = sc.nextInt(); // The parameter k
        String s = sc.next(); // The binary string

        // Count number of '1's in the string
        int cnt = s.length() - s.replace("1", "").length();

        // Calculate the maximum of current '1's and n - k
        int maxi = Math.max(cnt, n - k);

        // Output the result for this test case
        System.out.println(maxi);
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt(); // Number of test cases

        // Process each test case
        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}
