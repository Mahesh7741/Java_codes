import java.util.*;

public class QueueAtTheSchool {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int t = sc.nextInt();
        StringBuilder s = new StringBuilder(sc.next());

        while (t > 0) {
            for (int i = 1; i < n; i++) {
                if (s.charAt(i - 1) == 'B' && s.charAt(i) == 'G') {
                    s.setCharAt(i, 'B');
                    s.setCharAt(i - 1, 'G');
                    i++;
                }
            }
            t--;
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        solve();
    }
}

