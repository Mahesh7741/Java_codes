import java.util.*;

public class BrokenKeyboard {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        while (TCS-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        String s = sc.next();
        
        if (n % 3 == 2) {
            System.out.println("NO");
            return;
        }
        
        for (int i = 2; i < s.length(); i += 3) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
