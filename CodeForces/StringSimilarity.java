import java.util.Scanner;

public class StringSimilarity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 2 * n - 1; i += 2) {
                result.append(s.charAt(i));
            }
            System.out.println(result);
        }
        sc.close();
    }
}
