import java.util.*;

public class Channel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        
        int x = 0, y = 0;
        for (char c : s.toCharArray()) {
            if (c == '+') {
                x++;
            } else {
                y++;
            }
            if (a + x - y >= n) {
                System.out.println("YES");
                return;
            }
        }

        if (a + x - y >= n || a >= n) {
            System.out.println("YES");
        } else if (a + x >= n) {
            System.out.println("MAYBE");
        } else {
            System.out.println("NO");
        }
    }
}
