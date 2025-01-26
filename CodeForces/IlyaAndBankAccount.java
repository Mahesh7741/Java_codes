import java.util.*;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        new IlyaAndBankAccount().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        if (s.charAt(0) != '-') {
            System.out.println(s);
        } else {
            StringBuilder sb = new StringBuilder(s);
            int i = 1;
            while (i < sb.length() && sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
            }
            
            int sz = sb.length() - 1;
            if (sz > 0 && sb.charAt(sz - 1) > sb.charAt(sz)) {
                sb.deleteCharAt(sz - 1);
                if (sb.toString().equals("-0")) {
                    System.out.println(0);
                } else {
                    System.out.println(sb.toString());
                }
            } else {
                sb.deleteCharAt(sz);
                System.out.println(sb.toString());
            }
        }
    }
}
