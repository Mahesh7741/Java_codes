import java.util.*;

public class FindAndReplace {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        List<Pair> ans = new ArrayList<>();
        boolean sol = true;

        for (int i = 0; i < n; i++) {
            char c = (i % 2 == 0) ? 'o' : 'e';

            if (!visited(ans, s.charAt(i))) {
                ans.add(new Pair(s.charAt(i), c));
            }

            if (checkPos(ans, s.charAt(i), c)) {
                continue;
            } else {
                sol = false;
                break;
            }
        }

        System.out.println(sol ? "YES" : "NO");
    }

    public static boolean visited(List<Pair> ans, char ch) {
        for (Pair p : ans) {
            if (p.first == ch) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPos(List<Pair> ans, char ch, char c) {
        for (Pair p : ans) {
            if (p.first == ch && p.second == c) {
                return true;
            }
        }
        return false;
    }

    static class Pair {
        char first, second;

        Pair(char first, char second) {
            this.first = first;
            this.second = second;
        }
    }
}
