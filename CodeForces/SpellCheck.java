import java.util.*;

public class SpellCheck {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        
        if (sortedString.equals("Timru")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
