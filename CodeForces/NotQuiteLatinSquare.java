import java.util.*;

public class NotQuiteLatinSquare {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int[] freq = new int[3];

        for (int i = 0; i < 3; ++i) {
            String s = sc.next();
            for (int j = 0; j < 3; ++j) {
                if (s.charAt(j) == '?')
                    continue;
                freq[s.charAt(j) - 'A']++;
            }
        }

        for (int i = 0; i < 3; ++i) {
            if (freq[i] < 3) {
                System.out.println((char) (i + 'A'));
                return;
            }
        }
    }
}
