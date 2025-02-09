import java.util.*;
public class DeletiveEditing {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        String s = sc.next();
        String t = sc.next();
        Map<Character, Integer> m = new HashMap<>();

        for (char c : s.toCharArray()) m.put(c, m.getOrDefault(c, 0) + 1);
        for (char c : t.toCharArray()) m.put(c, m.getOrDefault(c, 0) - 1);

        StringBuilder sb = new StringBuilder(s);
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            char x = entry.getKey();
            int y = entry.getValue();
            for (int i = 0; i < sb.length() && y > 0; i++) {
                if (sb.charAt(i) == x) {
                    sb.deleteCharAt(i);
                    y--;
                    i--;
                }
            }
        }

        System.out.println(sb.toString().equals(t) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        for (int TC = 1; TC <= TCS; ++TC) {
            solve();
        }
    }
}
