import java.util.*;

public class ICPC_Balloons {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        String s = sc.next();

        HashSet<Character> hSet = new HashSet<>();
        long ans = 0;

        for (char ch : s.toCharArray()) {
            if (!hSet.contains(ch)) {
                ans += 2;
            } else {
                ans++;
            }
            hSet.add(ch);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
