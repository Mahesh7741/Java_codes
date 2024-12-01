import java.util.*;

public class BinaryStringReconstruction {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testcases = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (testcases-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            long x = sc.nextLong();
            sc.nextLine(); 
            StringBuilder o = new StringBuilder(String.join("", Collections.nCopies(n, "1")));

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    if (i - x >= 0) o.setCharAt(i - (int) x, '0');
                    if (i + x < n) o.setCharAt(i + (int) x, '0');
                }
            }

            boolean ok = true;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    boolean t = false;
                    if (i - x >= 0 && o.charAt(i - (int) x) == '1') t = true;
                    if (i + x < n && o.charAt(i + (int) x) == '1') t = true;
                    if (!t) {
                        ok = false;
                        break;
                    }
                }
            }

            System.out.println(ok ? o.toString() : "-1");
        }
    }
}
