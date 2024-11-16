import java.util.Scanner;
import java.util.Arrays;

public class UnluckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        String l = s.substring(0, n);
        String r = s.substring(n);

        char[] left = l.toCharArray();
        char[] right = r.toCharArray();

        Arrays.sort(left);
        Arrays.sort(right);

        boolean strictlyLess = true, strictlyMore = true;

        for (int i = 0; i < n; i++) {
            if (left[i] >= right[i]) {
                strictlyLess = false;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (left[i] <= right[i]) {
                strictlyMore = false;
                break;
            }
        }

        System.out.println((strictlyLess || strictlyMore) ? "YES" : "NO");

        sc.close();
    }
}
