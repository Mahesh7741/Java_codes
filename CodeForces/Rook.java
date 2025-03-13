import java.util.*;

public class Rook {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        String s = sc.next();
        String ch = "abcdefgh";
        int it = ch.indexOf(s.charAt(0));

        for (int i = 0; i < ch.length(); i++) {
            if (i == it) continue;
            System.out.println(ch.charAt(i) + "" + s.charAt(1));
        }

        for (int i = 1; i <= 8; i++) {
            if (i == Character.getNumericValue(s.charAt(1))) continue;
            System.out.println(s.charAt(0) + "" + i);
        }
    }
}
