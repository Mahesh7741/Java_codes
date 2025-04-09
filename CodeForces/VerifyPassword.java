import java.util.*;

public class VerifyPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TCS = sc.nextInt();
        while (TCS-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) < s.charAt(i - 1)) {
                    sorted = false;
                    break;
                }
            }

            if (sorted)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
