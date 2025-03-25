import java.util.*;

public class MakeItWhite {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        int i = 0, j = s.length() - 1;

        while (i < n && s.charAt(i) == 'W') i++;
        while (j >= 0 && s.charAt(j) == 'W') j--;

        System.out.println(j - i + 1);
    }
}
