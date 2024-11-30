import java.util.*;
public class From_S_To_T {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int q = sc.nextInt();
        while (q-- > 0) {
            String s = sc.next();
            String t = sc.next();
            String p = sc.next();
            int[] alphas = new int[27], alphap = new int[27], alphat = new int[27];
            for (char c : s.toCharArray()) alphas[c - 96]++;
            for (char c : p.toCharArray()) alphap[c - 96]++;
            for (char c : t.toCharArray()) alphat[c - 96]++;
            boolean check = true;
            for (int i = 0; i < 27; i++) {
                if (alphas[i] + alphap[i] < alphat[i] || alphas[i] > alphat[i]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                int lens = s.length(), lent = t.length();
                int x = 0, y = 0, cnt = 0;
                while (x < lens && y < lent) {
                    if (s.charAt(x) == t.charAt(y)) {
                        cnt++;
                        x++;
                        y++;
                    } else {
                        y++;
                    }
                }
                if (cnt != lens) check = false;
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}
