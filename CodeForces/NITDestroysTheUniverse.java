import java.util.*;
public class NITDestroysTheUniverse {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int cnt = 0;
            boolean cur = false;
            
            while (n-- > 0) {
                int x = sc.nextInt();
                if (x != 0) {
                    cur = true;
                } else if (cur) {
                    cnt++;
                    cur = false;
                }
            }

            cnt += cur ? 1 : 0;
            cnt = Math.min(cnt, 2);
            System.out.println(cnt);
        }
    }
}
