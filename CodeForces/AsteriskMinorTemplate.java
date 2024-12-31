import java.util.*;
public class AsteriskMinorTemplate {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            String t = sc.next();
            int n = s.length(), m = t.length();
            
            if (s.charAt(0) == t.charAt(0)) {
                System.out.println("YES");
                System.out.println(s.charAt(0) + "*");
            } else if (s.charAt(n - 1) == t.charAt(m - 1)) {
                System.out.println("YES");
                System.out.println("*" + s.charAt(n - 1));
            } else {
                boolean found = false;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < m - 1; j++) {
                        if (s.charAt(i) == t.charAt(j) && s.charAt(i + 1) == t.charAt(j + 1)) {
                            System.out.println("YES");
                            System.out.println("*" + s.charAt(i) + s.charAt(i + 1) + "*");
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (!found) System.out.println("NO");
            }
        }
    }
}
