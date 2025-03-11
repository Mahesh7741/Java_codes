import java.util.*;
public class BinaryImbalance {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean found = false;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    System.out.println("YES");
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("NO");
            }
        }
    }
}
