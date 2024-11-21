import java.util.*;

public class MoveBrackets {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0, open = 0, close = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(' && i + 1 < n && s.charAt(i + 1) == ')') {
                    i++;
                    continue;
                }
                if (s.charAt(i) == '(') {
                    open++;
                } else if (s.charAt(i) == ')') {
                    close++;
                    if (open < close) {
                        ans++;
                        close--;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
