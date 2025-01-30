import java.util.*;

public class ChewbaсcaAndNumber {
    
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        StringBuilder result = new StringBuilder(s);
        
        for (int i = 0; i < s.length(); ++i) {
            int x = s.charAt(i) - '0';
            if (i == 0 && x == 9) {
                continue;
            }
            if (x >= 5) {
                result.setCharAt(i, (char) ('9' - x + '0'));
            }
        }
        
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = 1;

        while (TC-- > 0) {
            solve();
        }
    }
}
