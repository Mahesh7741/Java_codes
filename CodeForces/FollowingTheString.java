import java.util.*;

public class FollowingTheString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        StringBuilder s = new StringBuilder();
        Map<Character, Integer> m = new HashMap<>();
        char c = 'a';

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            if (x == 0) {
                s.append(c);
                m.put(c, m.getOrDefault(c, 0) + 1);
                c++;
            } else {
                for (Map.Entry<Character, Integer> it : m.entrySet()) {
                    if (it.getValue() == x) {
                        s.append(it.getKey());
                        m.put(it.getKey(), it.getValue() + 1);
                        break;
                    }
                }
            }
        }
        System.out.println(s);
    }
}
