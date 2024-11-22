import java.util.*;

public class FrogJumps {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String str = sc.next();
            int length = str.length();
            int count = 0, pos = -1;
            for (int i = length - 1; i >= 0; i--) {
                count++;
                if (str.charAt(i) == 'R') {
                    pos = i;
                    break;
                }
            }

            int ans = count;
            count = 0;
            for (int i = 0; i <= pos; ++i) {
                if (str.charAt(i) == 'R') {
                    count++;
                    ans = Math.max(ans, count);
                    count = 0;
                } else {
                    count++;
                }
            }

            if (pos == -1) ans++;
            System.out.println(ans);
        }
    }
}
