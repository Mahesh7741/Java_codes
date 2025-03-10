import java.util.*;
public class CoverInWater {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int cnt = 0, ct = 0, mx = 0;

            for (char c : s.toCharArray()) {
                if (c == '.') {
                    cnt++;
                    ct++;
                }
                if (c == '#') {
                    mx = Math.max(mx, ct);
                    ct = 0;
                }
            }
            mx = Math.max(ct, mx);
            
            if (cnt == 0)
                System.out.println(0);
            else if (mx > 2)
                System.out.println(2);
            else
                System.out.println(cnt);
        }
    }
}
