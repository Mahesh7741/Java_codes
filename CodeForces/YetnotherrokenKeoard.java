import java.util.*;

public class YetnotherrokenKeoard {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        int small = 0, capital = 0;

        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                if (c == 'b') {
                    small++;
                } else if (small > 0) {
                    small--;
                } else {
                    ans.append(c);
                }
            } else {
                if (c == 'B') {
                    capital++;
                } else if (capital > 0) {
                    capital--;
                } else {
                    ans.append(c);
                }
            }
        }

        ans.reverse();
        System.out.println(ans);
    }
}
